package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Tomato");
        Product product2 = new Product("Cucumber");
        Item item1 = new Item(new BigDecimal(10), 7);
        Item item2 = new Item(new BigDecimal(12), 3);
        Invoice invoice = new Invoice("AA001");

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        item1.setProduct(product1);
        item2.setProduct(product2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();

    }
}
