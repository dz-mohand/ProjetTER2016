/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageExceptions;

/**
 *
 * @author proprietaire
 */
public class Exception_ParseException extends Exception{
    
    public Exception_ParseException() {
        super("Une erreur de conversion de type. L'exécution du programme a été interrompue.");
    }
    
    public String getExceptionMessage()
    {
        return "Une erreur de conversion de type. L'exécution du programme a été interrompue.";
    }

}
