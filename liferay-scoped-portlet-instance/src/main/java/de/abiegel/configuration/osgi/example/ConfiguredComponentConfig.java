package de.abiegel.configuration.osgi.example;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition.Scope;

import aQute.bnd.annotation.metatype.Meta.AD;
import aQute.bnd.annotation.metatype.Meta.OCD;


@ExtendedObjectClassDefinition(scope = Scope.PORTLET_INSTANCE, category = "collaboration")
@OCD( id = "de.abiegel.configuration.osgi.example.ConfiguredComponentConfig", localization = "content/Language", name = "foo-default-name")
public @interface ConfiguredComponentConfig {

	@AD(required = false, name = "foo-default-name-entry", deflt = "FOO")
	String defaultName() default "Foo";
}