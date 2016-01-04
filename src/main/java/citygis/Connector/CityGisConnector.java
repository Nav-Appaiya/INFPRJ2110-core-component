package Citygis.Connector;

import Entity.Event;
import org.hibernate.Session;

import java.util.*;




/**
 * Created by nav on 29-12-15.
 */
public class CityGisConnector{

    public static void main(String[] args) {
        CityGisConnector c = new CityGisConnector();
        c.createAndStoreEvent( "TEST", "2000-01-01" );
    }

    private void createAndStoreEvent(String title, String theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Event theEvent = new Event();
        theEvent.setValue(title);
        theEvent.setDateTime(theDate);
        session.save(theEvent);

        session.getTransaction().commit();
    }

}