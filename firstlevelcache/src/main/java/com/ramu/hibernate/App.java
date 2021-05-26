package com.ramu.hibernate;

import com.ramu.hibernate.entities.Category;
import com.ramu.hibernate.helper.SessionFactoryRegistry;
import javafx.scene.chart.CategoryAxis;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=null;
        Session session=null;
        Transaction transaction=null;
        boolean isError=true;
        try{
            sessionFactory= SessionFactoryRegistry.getSessionFactory();
            session=sessionFactory.openSession();

            Category category= session.get(Category.class,1);
            Category category1= session.get(Category.class,1);
            if(category==category1){
                System.out.println("Both are equal ..Hence from Cache");
            }
            session.evict(category);
            System.out.println("Cleared the pervious Object from Cache");
            Category c=session.get(Category.class,1);
           // session.clear();
            if(category==c){
                System.out.println("Its from Cache");
            }else{
                System.out.println("From DB hit");
            }

            session.close();
            System.out.println("Opening new Session");
            session=sessionFactory.openSession();
            Category c1=session.get(Category.class,1);
            if(!(c==c1)){
                System.out.println("Its from DB");
            }
            c1.setDescription("General Electorins");
            transaction=session.beginTransaction();
            session.update(c1);
            isError=false;
        }finally {

            if(transaction!=null){
                if(!isError){
                    transaction.commit();
                }else{
                    transaction.commit();
                }
            }


            if(session!=null)
                session.close();
            if(sessionFactory!=null){
                SessionFactoryRegistry.closeSessionFactory();
            }

        }


    }
}
