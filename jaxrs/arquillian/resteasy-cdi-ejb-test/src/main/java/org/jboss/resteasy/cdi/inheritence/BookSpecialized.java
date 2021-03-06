package org.jboss.resteasy.cdi.inheritence;

import javax.enterprise.inject.Specializes;

/**
 * If this class is enabled, it will be injected into the Book injection point in InheritanceResource.
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 * Copyright Dec 5, 2012
 */
@Specializes
@StereotypeAlternative
public class BookSpecialized extends Book
{
}
