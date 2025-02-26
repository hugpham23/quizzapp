// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package builder.proxies;

public class ConnectedSelector implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject connectedSelectorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Builder.ConnectedSelector";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Selected_School("Builder.Selected_School"),
		Selected_Course("Builder.Selected_Course"),
		Selected_Lecture("Builder.Selected_Lecture");

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

	public ConnectedSelector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ConnectedSelector(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject connectedSelectorMendixObject)
	{
		if (connectedSelectorMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, connectedSelectorMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.connectedSelectorMendixObject = connectedSelectorMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static builder.proxies.ConnectedSelector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new builder.proxies.ConnectedSelector(context, mendixObject);
	}

	public static builder.proxies.ConnectedSelector load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return builder.proxies.ConnectedSelector.initialize(context, mendixObject);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Selected_School
	 */
	public final builder.proxies.School getSelected_School() throws com.mendix.core.CoreException
	{
		return getSelected_School(getContext());
	}

	/**
	 * @param context
	 * @return value of Selected_School
	 * @throws com.mendix.core.CoreException
	 */
	public final builder.proxies.School getSelected_School(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		builder.proxies.School result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Selected_School.toString());
		if (identifier != null) {
			result = builder.proxies.School.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Selected_School
	 * @param selected_school
	 */
	public final void setSelected_School(builder.proxies.School selected_school)
	{
		setSelected_School(getContext(), selected_school);
	}

	/**
	 * Set value of Selected_School
	 * @param context
	 * @param selected_school
	 */
	public final void setSelected_School(com.mendix.systemwideinterfaces.core.IContext context, builder.proxies.School selected_school)
	{
		if (selected_school == null) {
			getMendixObject().setValue(context, MemberNames.Selected_School.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Selected_School.toString(), selected_school.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Selected_Course
	 */
	public final builder.proxies.Course getSelected_Course() throws com.mendix.core.CoreException
	{
		return getSelected_Course(getContext());
	}

	/**
	 * @param context
	 * @return value of Selected_Course
	 * @throws com.mendix.core.CoreException
	 */
	public final builder.proxies.Course getSelected_Course(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		builder.proxies.Course result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Selected_Course.toString());
		if (identifier != null) {
			result = builder.proxies.Course.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Selected_Course
	 * @param selected_course
	 */
	public final void setSelected_Course(builder.proxies.Course selected_course)
	{
		setSelected_Course(getContext(), selected_course);
	}

	/**
	 * Set value of Selected_Course
	 * @param context
	 * @param selected_course
	 */
	public final void setSelected_Course(com.mendix.systemwideinterfaces.core.IContext context, builder.proxies.Course selected_course)
	{
		if (selected_course == null) {
			getMendixObject().setValue(context, MemberNames.Selected_Course.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Selected_Course.toString(), selected_course.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Selected_Lecture
	 */
	public final builder.proxies.Lecture getSelected_Lecture() throws com.mendix.core.CoreException
	{
		return getSelected_Lecture(getContext());
	}

	/**
	 * @param context
	 * @return value of Selected_Lecture
	 * @throws com.mendix.core.CoreException
	 */
	public final builder.proxies.Lecture getSelected_Lecture(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		builder.proxies.Lecture result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Selected_Lecture.toString());
		if (identifier != null) {
			result = builder.proxies.Lecture.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Selected_Lecture
	 * @param selected_lecture
	 */
	public final void setSelected_Lecture(builder.proxies.Lecture selected_lecture)
	{
		setSelected_Lecture(getContext(), selected_lecture);
	}

	/**
	 * Set value of Selected_Lecture
	 * @param context
	 * @param selected_lecture
	 */
	public final void setSelected_Lecture(com.mendix.systemwideinterfaces.core.IContext context, builder.proxies.Lecture selected_lecture)
	{
		if (selected_lecture == null) {
			getMendixObject().setValue(context, MemberNames.Selected_Lecture.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Selected_Lecture.toString(), selected_lecture.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return connectedSelectorMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final builder.proxies.ConnectedSelector that = (builder.proxies.ConnectedSelector) obj;
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
