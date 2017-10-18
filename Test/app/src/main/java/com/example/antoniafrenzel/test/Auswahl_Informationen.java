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
        };

        //public class Informationen_Standort{
//        public String Standort[]={
//                "",
//                "",
//                "",
//                "",
//                "",
//                "",
//        };


        public String getInfo(int i)
        {
                String Wissen = Infos[i];
                return Wissen;
        }
}