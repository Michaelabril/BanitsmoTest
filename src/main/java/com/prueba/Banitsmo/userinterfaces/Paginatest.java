package com.prueba.Banitsmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/empresas/")
public class Paginatest extends PageObject {

    public static final Target PRODUCTOSANDSERVICIOS = Target.the("botonproductosServicios").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));
    public static final Target DEPOSITOS = Target.the("botonDepositos").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/ul[1]/li[1]/a"));
    public static final Target CUENTACOMERCIAL = Target.the("CuentaComercial").located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[2]/div/div[1]"));
    public static final Target DOCUMENTOS = Target.the("Documentos").located(By.xpath("//*[@id=\"filialTabs\"]/li[5]/a"));
    public static final Target PDF = Target.the("Pdf").located(By.xpath("//*[@id=\"tab5\"]/table/tbody/tr/td[2]/a/img"));

}
