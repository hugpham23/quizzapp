// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package quizapp.proxies;

public class MotorCycle extends quizapp.proxies.RemoteObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuizApp.MotorCycle";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TaxAmount("TaxAmount"),
		_Id("_Id"),
		CustomCreatedDate("CustomCreatedDate"),
		CustomChangedDate("CustomChangedDate"),
		CustomCreatedDateAsLong("CustomCreatedDateAsLong"),
		CustomChangedDateAsLong("CustomChangedDateAsLong"),
		RemoteObject_Account_CreatedBy("QuizApp.RemoteObject_Account_CreatedBy"),
		RemoteObject_Account_ChangedBy("QuizApp.RemoteObject_Account_ChangedBy");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MotorCycle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected MotorCycle(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject motorCycleMendixObject)
	{
		super(context, motorCycleMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, motorCycleMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static quizapp.proxies.MotorCycle initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new quizapp.proxies.MotorCycle(context, mendixObject);
	}

	public static quizapp.proxies.MotorCycle load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return quizapp.proxies.MotorCycle.initialize(context, mendixObject);
	}

	public static java.util.List<quizapp.proxies.MotorCycle> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> quizapp.proxies.MotorCycle.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of TaxAmount
	 */
	public final java.math.BigDecimal getTaxAmount()
	{
		return getTaxAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of TaxAmount
	 */
	public final java.math.BigDecimal getTaxAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TaxAmount.toString());
	}

	/**
	 * Set value of TaxAmount
	 * @param taxamount
	 */
	public final void setTaxAmount(java.math.BigDecimal taxamount)
	{
		setTaxAmount(getContext(), taxamount);
	}

	/**
	 * Set value of TaxAmount
	 * @param context
	 * @param taxamount
	 */
	public final void setTaxAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal taxamount)
	{
		getMendixObject().setValue(context, MemberNames.TaxAmount.toString(), taxamount);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final quizapp.proxies.MotorCycle that = (quizapp.proxies.MotorCycle) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
