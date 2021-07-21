package com.myshop.checkout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class CheckoutTest {

  @Test
  public void shouldReturnHello() {
    assertThat("Hello", is(equalTo("Hello")));
  }

}
