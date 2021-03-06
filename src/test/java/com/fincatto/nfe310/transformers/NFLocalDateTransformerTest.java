package com.fincatto.nfe310.transformers;

import java.util.TimeZone;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class NFLocalDateTransformerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
	}

    @Test
    public void deveTransformarDataStringEmLocalDate() throws Exception {
        Assert.assertEquals("2006-02-01", new NFLocalDateTransformer().read("2006-02-01-02:00").toString());
        Assert.assertEquals("2006-02-01", new NFLocalDateTransformer().read("2006-02-01").toString());
    }

    @Test
    public void deveTransformarLocalDateEmString() throws Exception {
        Assert.assertEquals("2015-10-04", new NFLocalDateTransformer().write(new LocalDate(2015, 10, 4)));
    }
}