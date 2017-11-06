package com.example.antoniafrenzel.test;

/**
 * Created by Antonia Frenzel on 08.10.2017.
 */

public class Auswahl_Fragen {
    public String mQuestions[]= {
            "Was ist das Recht auf informationelle Selbstbestimmung?",
            "Wie viel Prozent der Internet-Nutzer lesen die AGBs?",
            "Welches Gesetz wurde 2016 in Deutschland erlassen?",
            "Was sind Location-based Services?",
            "Welche Branche nutzt die Standortlokalisierung am meisten?",
            "Der Anbieter erfasst beim Registrieren des Geräts im Mobilfunknetz nicht den Standort.",
            "Je älter einer Deutscher wird, desto seltener ist er/sie bereit dein Standort preis zu geben.",
            "Wie genau kann der Standort bestimmt werden?",
            "Bei der Standortsuche wird zwischen Location-Tracking-Services und Position-Aware-Services unterschieden.",
            "Die Hardwaresensoren zur Standortlokalisierung sind so im Handy verbaut, dass weder Nutzer noch Entwickler Zugriff darauf haben.",
            "Die Standortlokalisierung auf dem Land ist genauer als in der Stadt.",
            "Google hat zum Erfassen von Material für Street-View mit seinen Fahrzeugen auch Daten von WLAN-Netzen mit erfasst.",
            "Jeder der das Internet nutzt hinterlässt Spuren über seine Identität und über sein Nutzerverhalten.",
            "Warum gehen Internetnutzer häufig unachtsam mit ihren persönlichen Daten im Internet um?",
            "Was ist eine große Gefahr des “Internet of Things” (IoT)?",
            "Deutsche haben gegenüber anderen Nationalitäten ein eher ausgeprägtes Bewusstsein zum Datenschutz.",
            "Durch das Sammeln von Daten gibt es keine Umsatzsteigerung des Einzelhandels durch Push-Up Nachrichten und Rabattcoupons.",
            "Wie viel Prozent der Deutschen ab 16 Jahren nutzen die Google-Dienste täglich?",
            "Welche Aufsicht für den öffentlichen Sektor gibt es für die Datenschutzkontrolle auf Bundesebene?",
            "Welcher Leitsatz für das Internet gilt?",
            "Eine Suchmaschine hat die Möglichkeiten alle Informationen seiner Nutzer zu sammeln und jeden eine eindeutige Nummer zugeben.",
            "Wie nennt man es, wenn vertrauliche Informationen wie Passwörter oder Kreditkartendaten abgefangt werden?",
            "Google ruft in regelmäßigen Abständen den Standort ab - auch wenn der Nutzer den Dienst in dem Moment nicht aktiv nutzen.",
            "Google ist für die Nutzer kostenlos. Doch wie verdienst Google sein Geld?"
    };
    private String mAuswahl[][]={
            //Frage 1
            {"Jede Person hat das Recht auf Achtung ihres Privats- und Familienlebens, ihrer Wohnung und ihrer Korrespondenz.",
                    "Jede Person hat das Recht auf Achtung ihres Aussehens.",
                    "Jede Person hat das Recht auf Bildung."},
            //Frage 2
            {"4,5 Prozent","8,2 Prozent","13,1 Prozent"},
            //3
            {"Gesichtserkennungverbot",
                    "Videoüberwachungsverbesserungsgesetz",
                    "Geburtsdatenspeicherungsgesetz"},
            //4
            {"Dienste, die bestimmen wie alt ein Gebäude ist.",
            "Dienste die, verraten wie alt eine Person wirklich ist.",
            "Dienste, die die geografische Position einer Person genau bestimmen könne."},
            //5
            {"Verkehr und Beförderung",
            "Maps und Navigation",
            "Tourismusbranche"},
            //6
            {"Wahr","Falsch","unwichtig"},
            //7
            {"Wahr","Falsch","unwichtig"},
            //8
            {"Bis zu 10 cm","Bis zu 50 cm","Bis zu einem Meter"},
            //9
            {"Wahr","Falsch","unwichtig"},
            //10
            {"Wahr","Falsch","unwichtig"},
            //11
            {"Wahr","Falsch","unwichtig"},
            //12
            {"Wahr","Falsch","unwichtig"},
            //13
            {"Wahr","Falsch","unwichtig"},
            //14
            {"Daten werden durch das Bundesdatenschutzgesetz geschützt.",
                    "Blindes Vertrauen in Anbieter und Gefühl der Anonymität.",
            "Nutzer werden dazu gezwungen."},
            //15
            {"Geräte gehen öfters kaputt.","Herkömmliche Haushaltsgeräte werden unerschwinglich.","Alle IoT-Gegenstände können persönliche Daten über das Nutzerverhalten weitergeben."},
            //16
            {"Wahr","Falsch","unwichtig"},
            //17
            {"Wahr","Falsch","unwichtig"},
            //18
            {"23 Prozent","66 Prozent","71 Prozent"},
            //19
            {"Ministerium für Datenschutz","Bundesbeauftragter für den Datenschutz","nichts"},
            //20
            {"Das Internet vergisst nicht.","Das Internet hat umfangreiche Gesetze zum Datenschutz","Das Internet vergisst nach 10 Jahren."},
            //21
            {"Wahr","Falsch","unwichtig"},
            //22
            {"Zählpixel","Pharming","Phishing"},
            //23
            {"Wahr","Falsch","unwichtig"},
            //24
            {"Der Nutzer bezahlt mit seinen persönlichen Daten","Google finanziert sich ausschließlich über Spenden","Google wird von EU-Geldern finanziert."}

    }; ///{"","",""}
    private String mAntwort[]={
            "Jede Person hat das Recht auf Achtung ihres Privats- und Familienlebens, ihrer Wohnung und ihrer Korrespondenz.",
            "4,5 Prozent",
            "Videoüberwachungsverbesserungsgesetz",
            "Dienste, die die geografische Position einer Person genau bestimmen könne.",
            "Tourismusbranche", "Falsch", "Wahr","Bis zu 10 cm", "Wahr", "Wahr", "Falsch", "Wahr","Wahr",
            "Blindes Vertrauen in Anbieter und Gefühl der Anonymität.","Alle IoT-Gegenstände können persönliche Daten über das Nutzerverhalten weitergeben.",
            "Wahr","Falsch", "66 Prozent", "Bundesbeauftragter für den Datenschutz","Das Internet vergisst nicht.", "Wahr",
            "Phishing", "Wahr", "Der Nutzer bezahlt mit seinen persönlichen Daten"};

    public String getFrage(int a){
        String Frage=mQuestions[a];
                return Frage;
    }
    public String getAuswahl1(int a){
        String Auswahl0=mAuswahl[a][0];
        return Auswahl0;
    }
    public String getAuswahl2(int a) {
        String Auswahl1 = mAuswahl[a][1];
        return Auswahl1;
    }
    public String getAuswahl3(int a) {
        String Auswahl2 = mAuswahl[a][2];
        return Auswahl2;
    }
    public String getCorrectAnswer(int a){
        String answer = mAntwort[a];
        return answer;
    }
}
