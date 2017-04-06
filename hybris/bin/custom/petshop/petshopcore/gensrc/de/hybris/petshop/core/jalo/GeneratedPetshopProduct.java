/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 06.04.2017 16:46:53                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.petshop.core.jalo;

import de.hybris.petshop.core.constants.PetshopCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.petshop.core.jalo.PetshopProduct PetshopProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPetshopProduct extends Product
{
	/** Qualifier of the <code>PetshopProduct.loyaltyPointValue</code> attribute **/
	public static final String LOYALTYPOINTVALUE = "loyaltyPointValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOYALTYPOINTVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetshopProduct.loyaltyPointValue</code> attribute.
	 * @return the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public Integer getLoyaltyPointValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LOYALTYPOINTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetshopProduct.loyaltyPointValue</code> attribute.
	 * @return the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public Integer getLoyaltyPointValue()
	{
		return getLoyaltyPointValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @return the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public int getLoyaltyPointValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLoyaltyPointValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @return the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public int getLoyaltyPointValueAsPrimitive()
	{
		return getLoyaltyPointValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @param value the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public void setLoyaltyPointValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LOYALTYPOINTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @param value the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public void setLoyaltyPointValue(final Integer value)
	{
		setLoyaltyPointValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @param value the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public void setLoyaltyPointValue(final SessionContext ctx, final int value)
	{
		setLoyaltyPointValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetshopProduct.loyaltyPointValue</code> attribute. 
	 * @param value the loyaltyPointValue - Defines how much points will be given to customer if he buy this product.
	 */
	public void setLoyaltyPointValue(final int value)
	{
		setLoyaltyPointValue( getSession().getSessionContext(), value );
	}
	
}
