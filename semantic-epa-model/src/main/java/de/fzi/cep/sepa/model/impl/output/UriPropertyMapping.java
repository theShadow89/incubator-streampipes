package de.fzi.cep.sepa.model.impl.output;

import java.net.URI;

import javax.persistence.Entity;

import com.clarkparsia.empire.annotation.Namespaces;
import com.clarkparsia.empire.annotation.RdfProperty;
import com.clarkparsia.empire.annotation.RdfsClass;

import de.fzi.cep.sepa.model.UnnamedSEPAElement;
import de.fzi.cep.sepa.model.impl.eventproperty.EventProperty;

@Namespaces({"sepa", "http://sepa.event-processing.org/sepa#",
	 "dc",   "http://purl.org/dc/terms/"})
@RdfsClass("sepa:UriPropertyMapping")
@Entity
public class UriPropertyMapping extends UnnamedSEPAElement {

	private static final long serialVersionUID = 1L;

	@RdfProperty("sepa:replaceFrom")
	private URI replaceFrom;
	
	@RdfProperty("sepa:replaceTo")
	private URI replaceTo;
	
	@RdfProperty("sepa:replaceWith")
	private EventProperty replaceWith;
	
	@RdfProperty("sepa:renamingAllowed")
	private boolean renamingAllowed;
	
	@RdfProperty("sepa:typeCastAllowed")
	private boolean typeCastAllowed;
	
	@RdfProperty("sepa:domainPropertyCastAllowed")
	private boolean domainPropertyCastAllowed;
	
	public UriPropertyMapping() {
		super();
	}
	
	public UriPropertyMapping(UriPropertyMapping other) {
		super();
		this.replaceFrom = other.getReplaceFrom();
		this.replaceWith = other.getReplaceWith();
		this.renamingAllowed = other.isRenamingAllowed();
		this.typeCastAllowed = other.isTypeCastAllowed();
		this.domainPropertyCastAllowed = other.isDomainPropertyCastAllowed();
	}

	public URI getReplaceFrom() {
		return replaceFrom;
	}

	public EventProperty getReplaceWith() {
		return replaceWith;
	}
	
	public void setReplaceFrom(URI replaceFrom) {
		this.replaceFrom = replaceFrom;
	}

	public void setReplaceWith(EventProperty replaceWith) {
		this.replaceWith = replaceWith;
	}

	public boolean isRenamingAllowed() {
		return renamingAllowed;
	}

	public void setRenamingAllowed(boolean renamingAllowed) {
		this.renamingAllowed = renamingAllowed;
	}

	public boolean isTypeCastAllowed() {
		return typeCastAllowed;
	}

	public void setTypeCastAllowed(boolean typeCastAllowed) {
		this.typeCastAllowed = typeCastAllowed;
	}

	public boolean isDomainPropertyCastAllowed() {
		return domainPropertyCastAllowed;
	}

	public void setDomainPropertyCastAllowed(boolean domainPropertyCastAllowed) {
		this.domainPropertyCastAllowed = domainPropertyCastAllowed;
	}

	public URI getReplaceTo() {
		return replaceTo;
	}

	public void setReplaceTo(URI replaceTo) {
		this.replaceTo = replaceTo;
	}
			
}