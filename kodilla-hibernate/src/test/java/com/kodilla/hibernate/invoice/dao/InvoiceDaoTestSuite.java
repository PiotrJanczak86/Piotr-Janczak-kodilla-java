package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Tomato");
        Product product2 = new Product("Cucumber");
        Item item1 = new Item(product1, new BigDecimal(10), 7);
        Item item2 = new Item(product2, new BigDecimal(12), 3);
        Invoice invoice = new Invoice("AA001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        assertNotEquals(0, id);
    }
}
