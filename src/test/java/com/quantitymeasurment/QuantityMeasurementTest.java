package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenValueInZeroFeetAndZeroFeet_ShouldReturnEqualValue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroFeetAndOneFeet_ShouldReturnWrongValue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenValueZeroAndNullInFeet_ShouldReturnWrongValue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(feet1,null);
    }

    @Test
    public void givenValueZeroAndNullInFeet1_ShouldReturnWrongValue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void givenValueInZeroInchAndZeroInch_ShouldReturnEqualValue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenValueInZeroInchAndOneInch_ShouldReturnEqualValue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
}
