package com.example.antoniafrenzel.test;

/**
 * Created by Clara on 17.10.2017.
 */

public class Auswahl_Informationen {
        public String Infos[]= {
                "„Sammelbegriff über die in verschiedenen Gesetze zum Schutz des Individuums angeordneten Rechtsnormen, die erreichen sollen, dass seine Privatsphäre in einer zunehmend automatisierten und computerisierten Welt („Der gläserne Mensch“) vor unberechtigten Zugriffen von außen (Staat, andere Private) geschützt wird.“\n" + "Quelle: Wirtschaftslexikon Gabler\n" + "\n",
                "Jeder der das Internet nutzt hinterlässt Spuren über seine Identität und/oder über sein Nutzerverhalten.",
                "Internetnutzer gehen häufig unachtsam mit ihren persönlichen Daten im Internet um –  aufgrund von blindem Vertrauen in Anbieter und dem Gefühl von Anonymität im Internet.",
                "Durch das „Internet of Things“ wird das Thema Datenschutz immer präsenter, da technische Geräte (beispielsweise Kühlschränke oder Alarmanlagen) über den Anschluss zum Internet persönliche Daten über das Nutzerverhalten weitergeben.",
                "Studien zeigen, dass Deutsche im Vergleich zu anderen Nationalitäten ein eher ausgeprägtes Bewusstsein zum Datenschutz haben.",
                "Fazit: Es ist wichtig das Recht auf Privatsphäre jedes Nutzers im Internet zu wahren. Zudem müssen Nutzer über die Weitergabe und das Sammeln ihrer persönlichen Daten ausreichend aufgeklärt werden. Ein Bewusstsein hierfür gilt es zu Schaffen.",
                "Glückwunsch! \n Du hast alle Informationen zu dem Thema Datenschutz durchgearbeitet! Gehe zurück ins Menü, um weitere Informationen zu erhalten.",
        };

        public String Standort[]={
                "Vorteile der Standortlokalisierung von Smartphones:",
                "1. Navigationsgerät im Auto",
                "2. Wetterapplikationen",
                "3. Echtzeitinformationen zu Fahrplänen",
                "4. Informationen zu Restaurants/Bars in naher Umgebung",
                "5. Katastrophen-Warnungen",
                "Nachteile der Standortlokalisierung von Smartphones:",
                "1. Sammeln persönlicher standortbezogener Daten (Durchleuchten des Nutzers)",
                "2. Wartung und Verbesserung der Google-Dienste",
                "3. Anbieten personifizierter Werbung",
                "4. Umsatzsteigerung des Einzelhandels durch Push-Up Nachrichten und Rabattcoupons",
                "Glückwunsch! \n Du hast alle Informationen zu dem Thema Standortlokalisierung durchgearbeitet! Gehe zurück ins Menü, um weitere Informationen zu erhalten.",
        };

        public String Google[]={
                "Laut einer Umfrage der Datenbank Statista nutzen 66 Prozent der Deutschen ab 16 Jahren Google-Dienste täglich und 26 Prozent mehrmals wöchentlich.",
                "Das Angebot der Google-Applikationen für Smartphone-Nutzer umfasst Google Maps, Gmail, YouTube, Google Drive und Google Plus, um nur einige von ihnen zu nennen.",
                "Location-based Services decken das in der mobilen Welt neu entstandene Bedürfnis nach einem Mobilitätsmanagement (Auskünfte zu Preisen, Fahrplänen, Parkplätzen, Reisewarnungen, Unterkünften und Restaurants).",
                "Als Smartphone Nutzer hat man kaum attraktive Alternativen zu Google, da die meisten Smartphones (Android, IOS) für eine Verknüpfung mit einem Google-Account ausgelegt sind.",
                "Mit zunehmendem Alter nimmt diese Bereitschaft kontinuierlich ab. So geben bei den 40-49-jährigen nur noch 15,3 Prozent ihren Aufenthaltsort preis und bei den über 60-jährigen lediglich 7,6 Prozent.",
                "Glückwunsch! \n Du hast alle Informationen zu dem Thema Google Standortlokalisierung durchgearbeitet! Gehe zurück ins Menü, um weitere Informationen zu erhalten.",
        };

        public String getInfo(int i)
        {
            String Wissen = Infos[i];
            return Wissen;
        }

        public String getInfoStandort(int x)
        {
            String InfoStandort = Standort[x];
            return InfoStandort;
        }

        public String getInfoGoogle(int a)
        {
            String InfoGoogle = Google[a];
            return InfoGoogle;
        }
}