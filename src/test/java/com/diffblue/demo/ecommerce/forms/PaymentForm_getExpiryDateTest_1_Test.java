package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_getExpiryDateTest_1_Test {
  @Test
  public void getExpiryDateTest() throws Exception {
    // Arrange
    PaymentForm paymentForm = new PaymentForm();

    // Act
    Date actual = paymentForm.getExpiryDate();

    // Assert
    Assert.assertEquals(null, actual);
    String cvv = paymentForm.getCvv();
    String toStringResult = paymentForm.toString();
    Date expiryDate = paymentForm.getExpiryDate();
    String cardNumber = paymentForm.getCardNumber();
    Assert.assertEquals(null, cvv);
    Assert.assertEquals(null, paymentForm.getNameOnCard());
    Assert.assertEquals(null, cardNumber);
    Assert.assertEquals(null, expiryDate);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
