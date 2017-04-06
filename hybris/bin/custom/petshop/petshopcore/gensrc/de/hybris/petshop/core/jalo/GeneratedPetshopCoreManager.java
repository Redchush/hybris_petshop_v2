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
import de.hybris.petshop.core.jalo.ApparelProduct;
import de.hybris.petshop.core.jalo.ApparelSizeVariantProduct;
import de.hybris.petshop.core.jalo.ApparelStyleVariantProduct;
import de.hybris.petshop.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.petshop.core.jalo.PetshopProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>PetshopCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPetshopCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("totalLoyaltyPoints", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("totalLoyaltyPoints", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("totalLoyaltyPoints", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PetshopCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PetshopCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PetshopCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PetshopCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public PetshopProduct createPetshopProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PetshopCoreConstants.TC.PETSHOPPRODUCT );
			return (PetshopProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PetshopProduct : "+e.getMessage(), 0 );
		}
	}
	
	public PetshopProduct createPetshopProduct(final Map attributeValues)
	{
		return createPetshopProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return PetshopCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public Integer getTotalLoyaltyPoints(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, PetshopCoreConstants.Attributes.Customer.TOTALLOYALTYPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public Integer getTotalLoyaltyPoints(final Customer item)
	{
		return getTotalLoyaltyPoints( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getTotalLoyaltyPoints( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final Customer item)
	{
		return getTotalLoyaltyPointsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, PetshopCoreConstants.Attributes.Customer.TOTALLOYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public void setTotalLoyaltyPoints(final Customer item, final Integer value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final Customer item, final int value)
	{
		setTotalLoyaltyPoints( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Defines current total sum of customer loyalty points
	 */
	public void setTotalLoyaltyPoints(final Customer item, final int value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public Integer getTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrder item)
	{
		return (Integer)item.getProperty( ctx, PetshopCoreConstants.Attributes.AbstractOrder.TOTALLOYALTYPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public Integer getTotalLoyaltyPoints(final AbstractOrder item)
	{
		return getTotalLoyaltyPoints( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Integer value = getTotalLoyaltyPoints( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final AbstractOrder item)
	{
		return getTotalLoyaltyPointsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrder item, final Integer value)
	{
		item.setProperty(ctx, PetshopCoreConstants.Attributes.AbstractOrder.TOTALLOYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public void setTotalLoyaltyPoints(final AbstractOrder item, final Integer value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrder item, final int value)
	{
		setTotalLoyaltyPoints( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints - Total sum of loyalty points received by user in this order
	 */
	public void setTotalLoyaltyPoints(final AbstractOrder item, final int value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints
	 */
	public Integer getTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Integer)item.getProperty( ctx, PetshopCoreConstants.Attributes.AbstractOrderEntry.TOTALLOYALTYPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute.
	 * @return the totalLoyaltyPoints
	 */
	public Integer getTotalLoyaltyPoints(final AbstractOrderEntry item)
	{
		return getTotalLoyaltyPoints( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Integer value = getTotalLoyaltyPoints( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @return the totalLoyaltyPoints
	 */
	public int getTotalLoyaltyPointsAsPrimitive(final AbstractOrderEntry item)
	{
		return getTotalLoyaltyPointsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrderEntry item, final Integer value)
	{
		item.setProperty(ctx, PetshopCoreConstants.Attributes.AbstractOrderEntry.TOTALLOYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints
	 */
	public void setTotalLoyaltyPoints(final AbstractOrderEntry item, final Integer value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints
	 */
	public void setTotalLoyaltyPoints(final SessionContext ctx, final AbstractOrderEntry item, final int value)
	{
		setTotalLoyaltyPoints( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalLoyaltyPoints</code> attribute. 
	 * @param value the totalLoyaltyPoints
	 */
	public void setTotalLoyaltyPoints(final AbstractOrderEntry item, final int value)
	{
		setTotalLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
}
