package com.esiee;

import java.io.IOException;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class CloudEsieeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		DatastoreService dataStore = DatastoreServiceFactory.getDatastoreService();
		Entity etudiant = new Entity("Ecole");
		etudiant.setProperty("nom", "Tintin");
		etudiant.setProperty("age", 20);
		dataStore.put(etudiant);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
