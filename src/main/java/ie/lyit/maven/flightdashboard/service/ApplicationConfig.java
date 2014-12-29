/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.maven.flightdashboard.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Previn
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ie.lyit.maven.flightdashboard.service.LyitAirlineFacadeREST.class);
        resources.add(ie.lyit.maven.flightdashboard.service.LyitDisplayboardFacadeREST.class);
        resources.add(ie.lyit.maven.flightdashboard.service.LyitFlightFacadeREST.class);
        resources.add(ie.lyit.maven.flightdashboard.service.LyitRoleFacadeREST.class);
        resources.add(ie.lyit.maven.flightdashboard.service.LyitRoleUserFacadeREST.class);
        resources.add(ie.lyit.maven.flightdashboard.service.LyitUserFacadeREST.class);
    }
    
}
