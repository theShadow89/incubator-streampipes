package org.streampipes.pe.processors.esper;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.clarkparsia.empire.SupportsRdfId.URIKey;

import org.streampipes.commons.Utils;
import org.streampipes.pe.processors.esper.aggregate.avg.AggregationController;
import org.streampipes.model.impl.EventGrounding;
import org.streampipes.model.impl.eventproperty.EventProperty;
import org.streampipes.model.impl.eventproperty.EventPropertyPrimitive;
import org.streampipes.model.impl.EventSchema;
import org.streampipes.model.impl.EventStream;
import org.streampipes.model.impl.staticproperty.FreeTextStaticProperty;
import org.streampipes.model.impl.JmsTransportProtocol;
import org.streampipes.model.impl.staticproperty.MappingPropertyUnary;
import org.streampipes.model.impl.staticproperty.StaticProperty;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.model.impl.graph.SepaDescription;
import org.streampipes.model.impl.graph.SepaInvocation;
import org.streampipes.model.vocabulary.XSD;
import org.streampipes.storage.controller.StorageManager;

public class TestAggregation {

//	public static void main(String[] args)
//	{
//		SepDescription sep = null;
//		try {
//			sep = StorageManager.INSTANCE.getStorageAPI().getSEPById("http://localhost:8089/random");
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		AggregationController eventRateController = new AggregationController();
//		SepaDescription test = eventRateController.declareModel();
//		test.setUri("http://test");
//		//test.setElementId("http://test");
//		test.setRdfId(new URIKey(URI.create("http://test.de")));
//
//		SepaInvocation testGraph = new SepaInvocation(test);
//		testGraph.setInputStreams(Utils.createList(sep.getEventStreams().get(0)));
//		EventStream outputStream = new EventStream();
//
//		List<EventProperty> outputProperties = new ArrayList<>();
//		outputProperties.add(new EventPropertyPrimitive(XSD._double.toString(),
//				"averageValue", "", Utils.createURI("http://schema.org/Number")));
//
//		EventSchema outputSchema = new EventSchema();
//		outputSchema.setEventProperties(outputProperties);
//		outputStream.setEventSchema(outputSchema);
//
//		EventGrounding outputGrounding = new EventGrounding();
//		outputGrounding.setTransportProtocol(new JmsTransportProtocol(ClientConfiguration.INSTANCE.getJmsHost(), ClientConfiguration.INSTANCE.getJmsPort(), "FZI.Test"));
//
//		outputStream.setEventGrounding(outputGrounding);
//
//		List<StaticProperty> staticProperties = new ArrayList<StaticProperty>();
//
//		MappingPropertyUnary mp = new MappingPropertyUnary(URI.create(test.getEventStreams().get(0).getEventSchema().getEventProperties().get(0).getElementId()), "groupBy", "group stream by: ", "");
//		mp.setMapsTo(URI.create(sep.getEventStreams().get(0).getEventSchema().getEventProperties().get(1).getElementId()));
//		staticProperties.add(mp);
//
//		FreeTextStaticProperty text1 = new FreeTextStaticProperty("outputEvery", "output values every (seconds)", "");
//		text1.setValue("5");
//		staticProperties.add(text1);
//		FreeTextStaticProperty text2 = new FreeTextStaticProperty("timeWindow", "output values every (seconds)", "");
//		text2.setValue("10");
//		staticProperties.add(text2);
//
//		testGraph.setStaticProperties(staticProperties);
//		testGraph.setOutputStream(outputStream);
//
//		eventRateController.invokeRuntime(testGraph);
//	}
}