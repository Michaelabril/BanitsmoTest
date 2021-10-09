package com.prueba.Banitsmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/wcm/connect/www.banistmo.com11237/7487365d-ee74-464e-9444-fc806b2307db/%233.+Contrato+Unico+de+Producto+y+Servicios+Bancarios+Oct15.pdf?MOD=AJPERES&CVID=lKMuboh")
public class PaginatestPdf extends PageObject {
    public static final Target PAGEPDF = Target.the("PagePdf").located(By.xpath("//*[@id=\"plugin\"]"));
    public static final Target DOWNLOADPDF = Target.the("downloadPdf").located(By.id("download"));
    public static final Target VIEWPAGE = Target.the("ViewPage").located(By.xpath("//*[@id=\"toolbar\"]"));

}
