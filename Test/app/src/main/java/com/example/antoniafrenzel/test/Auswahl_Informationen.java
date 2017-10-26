package com.example.antoniafrenzel.test;

/**
 * Created by Clara on 17.10.2017.
 */

public class Auswahl_Informationen {
        public String Infos[]= {
                "„Sammelbegriff über die in verschiedenen Gesetze zum Schutz des Individuums angeordneten Rechtsnormen, die erreichen sollen, dass seine Privatsphäre in einer zunehmend automatisierten und computerisierten Welt vor unberechtigten Zugriffen von außen geschützt wird.“\n" + "Quelle: Wirtschaftslexikon Gabler\n" + "\n",
                "Jeder der das Internet nutzt hinterlässt Spuren über seine Identität und sein Nutzerverhalten.",
                "Daher sollte jeder Internetnutzer beachten:\n(1.) Selbstschutz: Achtsam mit persönlichen Daten umzugehen.\n(2.) Fremdschutz: Den Nutzer durch Gesetze zu schützen.",
                "Internetnutzer gehen häufig unachtsam mit ihren persönlichen Daten im Internet um –  aufgrund von blindem Vertrauen in Anbieter und dem Gefühl von Anonymität im Internet.",
                "Durch das „Internet of Things“ wird das Thema Datenschutz immer präsenter, da technische Geräte (beispielsweise Kühlschränke oder Alarmanlagen) über den Anschluss zum Internet persönliche Daten über das Nutzerverhalten weitergeben.",
                "Studien zeigen, dass Deutsche im Vergleich zu anderen Nationalitäten ein eher ausgeprägtes Bewusstsein zum Datenschutz haben.",
                "Fazit: Es ist wichtig das Recht auf Privatsphäre jedes Nutzers im Internet zu wahren. Zudem müssen Nutzer über die Weitergabe und das Sammeln ihrer persönlichen Daten ausreichend aufgeklärt werden. Ein Bewusstsein hierfür gilt es zu Schaffen.",
                "Glückwunsch! \n Du hast alle Informationen zu dem Thema Datenschutz durchgearbeitet! Gehe zurück in das Menü, um weitere Informationen zu erhalten.",
        };

        public String Standort[]={
                "VORTEILE \n\n Der Standortlokalisierung von Smartphones.",
                "1. \n\nNavigationsgerät",
                "2. \n\nWetterapplikationen",
                "3. \n\nEchtzeitinformationen zu Fahrplänen",
                "4. \n\nInformationen zu Restaurants, Bars, Hotels etc. in naher Umgebung",
                "5. \n\nKatastrophen-Warnungen",
                "6. \n\nFind-your-Phone Applikation, die das Handy bei einem Diebstahl ortet",
                "NACHTEILE \n\n Der Standortlokalisierung von Smartphones.",
                "1. \n\nSammeln persönlicher standortbezogener Daten (Durchleuchten des Nutzers)",
                "2. \n\nAnbieten personifizierter Werbung",
                "3. \n\nUmsatzsteigerung des Einzelhandels durch Push-Up Nachrichten und Rabattcoupons",
                "GLÜCKWUNSCH! \n\n Du hast alle Informationen zu dem Thema Standortlokalisierung durchgearbeitet! Gehe zurück in das Menü, um weitere Informationen zu erhalten.",
        };

        public String Google[]={
                "FAKTEN \n\n Zu der Standortlokalisierung von Google Applikationen.",
                "Laut einer Umfrage der Datenbank Statista nutzen 66 Prozent der Deutschen ab 16 Jahren Google-Dienste täglich.",
                "Das Angebot der Google-Applikationen für Smartphone-Nutzer umfasst Google Maps, Gmail, YouTube, Google Drive und Google Plus (um nur einige der bekanntesten zu nennen).",
                "Location-based Services decken das in der mobilen Welt neu entstandene Bedürfnis nach einem Mobilitätsmanagement (Auskünfte zu Preisen, Fahrplänen, Parkplätzen, Reisewarnungen, Unterkünften und Restaurants).",
                "Als Smartphone Nutzer hat man kaum attraktive Alternativen zu Google, da die meisten Smartphones (Android, IOS) für eine Verknüpfung mit einem Google-Account ausgelegt sind.",
                "Der Standort wird nicht nur beim Verwenden der Applikationen erfasst und gespeichert. Vielmehr ruft Google in regelmäßigen Abständen den Aufenthaltsort der Anwender ab – auch wenn diese die Applikationen in dem Moment nicht aktiv verwendet werden.",
                "Der Nutzer muss sich fragen, warum viele Dienste, die in der Entwicklung sehr teuer sind, letztendlich kostenlos genutzt werden können: Die erhobenen Daten der Nutzer sind das Kaptital von Google (also: persönliche Daten als Gegenleistung zur kostenlosen Nutzung der Google Dienste).",
                "Mit zunehmendem Alter nimmt diese Bereitschaft kontinuierlich ab, seinen Aufenthaltsort über das Smartphone preiszugeben.",
                "GLÜCKWUNSCH! \n\n Du hast alle Informationen zu dem Thema Google Standortlokalisierung durchgearbeitet! Gehe zurück in das Menü, um weitere Informationen zu erhalten.",
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