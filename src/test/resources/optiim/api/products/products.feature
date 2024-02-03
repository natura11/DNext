#language: en

Feature: Pia product management Api Tests

  @regression @pia @productsapi @VFALFT-10565
  Scenario: Land Products Page
    #When I Land Products Page "https://dev.dnext-vfal.com/ui/orderCapture/products?customerId=f8e229af-4c40-42fb-bce4-0646c724a1cb"
    When I Land Products Page "https://dsales-ui.uat.dnext.al.vodafone.com/products?customerId=F61569584&account=8880203a-97cb-46d4-ae72-92f0817d0101"


  @regression @pia @productsapi @VFALFT-10567 @smoke
  Scenario: Search Product FullName
    When I Search Product FullName "VOIP"

  @regression @pia @productsapi @VFALFT-10569
  Scenario: Search Product PartialName
    When I Search Product FullName "VO"

  @regression @pia @productsapi @VFALFT-8671
  Scenario: Search Product PartialName
    When I Search Product FullName "VOX"

  @regression @pia @productsapi @VFALFT-10571 @smoke
  Scenario: Search Product with City
    When I Search Product with City "Berat"

  @regression @pia @productsapi @VFALFT-10573
  Scenario: Catalog Filter
    When I Filter Catalog "Individual"

  @regression @pia @productsapi @VFALFT-10575
  Scenario: Multiple Catalog Filter
    When I Multiple Filter Catalog "Individual" and "Foreigner"
