package com.github.wenhao;

public class TaxiChargeFactory
{

    public TaxiCharge getTaxiCharge(final String taxiType)
    {
        TaxiConfig taxiConfig = new TaxiConfig();
        MultipleTaxiChargeFactory taxiCharge = new MultipleTaxiChargeFactory(taxiConfig);

        TaxiCharge dayCharge = taxiCharge.getDayCharge(taxiType);
        TaxiCharge nightCharge = taxiCharge.getNightCharge(taxiType);
        return new TimeTaxiCharge(dayCharge, nightCharge);
    }

}
