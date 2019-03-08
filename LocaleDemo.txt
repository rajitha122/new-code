
import java.util.*;
public class LocaleDemo
{
    public static void main(String[] args)
    {
        // Creting a new Locale
        Locale loc1 = new Locale("English", "IN");
 
        // Use of getDefault() :
        Locale loc2 = Locale.getDefault();
 
        System.out.println("Locale name : " + loc1);
        System.out.println("Locale name Default : " + loc2);
 
        // Use of getDisplayCountry() :
        System.out.println("\nCountry Name : "
                            + loc1.getDisplayCountry());
 
        // Use of getCountry() :
        System.out.println("Country Name ISO 3166 2-letter code : "
                                            + loc1.getCountry());
 
        // Use of equal() :
        System.out.println("\nIs loc1 equals loc2 : "
                                 + loc1.equals(loc2));
 
        // clone() : loc3 is a clone of loc2
        Locale loc3 = (Locale) loc2.clone();
 
        // Locale : loc3
        System.out.println("Locale loc3 same as loc2 : "
                                                + loc3);
 
        // Use of getAvailableLocales()
        Locale[] loc4 = Locale.getAvailableLocales();
 
        // We are not printing all the locales.
        System.out.println("\nInstalled locales are : ");
        for (int i = 1; i < loc4.length/10; i++)
            System.out.println(i + ":" + loc4[i]);
 
        // Use of getDisplayLanguage() :
        System.out.println("\nloc2 Language : "
                        + loc2.getDisplayLanguage());
 
        // Use of getDisplayLanguage(Locale in) :
        System.out.println("Language of in Locale : "
          + loc1.getDisplayLanguage(new Locale("France", "French")));
 
        // Use of getDisplayName :
        System.out.println("\nUse of getDisplayName : "
                              + loc1.getDisplayName());
 
        // Use of getDisplayName(Locale in) :
        System.out.println("Name of in Locale : "
          + loc2.getDisplayName(new Locale("English", "english")));
 
        // Use of getISO3Country() :
        System.out.println("\nISO3 Country Name of loc3 : "
                                    + loc3.getISO3Country());
 
    }
}
