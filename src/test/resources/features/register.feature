@portalBanistmo
Feature: PortalBanistmo
  @tag1
  Scenario: Ir a portal de banistmo y descargar pdf
    Given el usuario ingresa a la pagina del portal de banistmo
    When el puede descargar el archivo pdf
    Then valida que si se descargo correctamente