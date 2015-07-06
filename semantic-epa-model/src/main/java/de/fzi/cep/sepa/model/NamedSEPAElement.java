package de.fzi.cep.sepa.model;


import com.clarkparsia.empire.annotation.RdfId;
import com.clarkparsia.empire.annotation.RdfProperty;

/**
 * named SEPA elements, can be accessed via the URI provided in @RdfId
 *
 */
public abstract class NamedSEPAElement extends AbstractSEPAElement{

	@RdfProperty("sepa:hasName")
	protected String name;
	
	@RdfProperty("rdfs:description")
	protected String description;
	
	@RdfProperty("sepa:hasIconUrl")
	protected String iconUrl;
	
	@RdfProperty("sepa:hasURI")
	@RdfId
	protected String uri;
	
	public NamedSEPAElement()
	{
		super();
	}
	
	public NamedSEPAElement(String uri, String name, String description, String iconUrl)
	{
		super();
		this.uri = uri;
		this.name = name;
		this.description = description;
		this.iconUrl = iconUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

	
	
}
