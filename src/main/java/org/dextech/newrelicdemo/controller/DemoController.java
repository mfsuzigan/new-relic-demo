package org.dextech.newrelicdemo.controller;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author michel
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/21/19 3:40 PM
 */
@RestController
public class DemoController {

    @GetMapping("divisao")
    public BigDecimal dividir (@RequestParam("dividendo") final BigDecimal dividendo,
            @RequestParam("divisor") final BigDecimal divisor) {
        return dividendo.divide(divisor, MathContext.DECIMAL32);
    }
}
