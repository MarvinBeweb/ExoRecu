package exorecur;
/**
 * @author marvin
 */
public class ExoRecursif {
    public static void main(String[] args) {
        //creation des dossiers Parents
        Repertoire racine = new Repertoire("D");
        Repertoire media = new Repertoire("Multimedia");
        Repertoire doc = new Repertoire("Documents");
        Repertoire photo = new Repertoire("Photos");
        Repertoire vids = new Repertoire("Videos");
        Repertoire img = new Repertoire("Images");
        Repertoire pic = new Repertoire("Pictures");
        Repertoire douze = new Repertoire("2012");
        Repertoire vingt = new Repertoire("2020");
        Repertoire web = new Repertoire("web");
        Repertoire zoo = new Repertoire("Animaux");
        Repertoire dog = new Repertoire("Chiens");
        Repertoire snake = new Repertoire("Python");
        Repertoire zboub = new Repertoire("Zizi du monde");
        
       
        //ajout des sous dossier dans les dossier parents (node=noeuds)
        racine.rep.add(media);
        racine.rep.add(doc);
        media.rep.add(img);
        media.rep.add(vids);
        img.rep.add(photo);
        img.rep.add(pic);
        photo.rep.add(douze);
        photo.rep.add(vingt);
        pic.rep.add(web);
        web.rep.add(zoo);
        zoo.rep.add(dog);
        zoo.rep.add(snake);
        zoo.rep.add(zboub);
        
        
        //Ajout des dernier dossier (leaf =feuille)
        doc.rep.add(new Repertoire("Word"));
        doc.rep.add(new Repertoire("Excel"));
        doc.rep.add(new Repertoire("Facture"));
        vids.rep.add(new Repertoire("Films"));
        vids.rep.add(new Repertoire("Animes"));
        douze.rep.add(new Repertoire("01"));
        douze.rep.add(new Repertoire("02"));
        vingt.rep.add(new Repertoire("01"));
        vingt.rep.add(new Repertoire("12"));
        web.rep.add(new Repertoire("Porn"));
        dog.rep.add(new Repertoire("Poils long"));
        dog.rep.add(new Repertoire("Poils court"));
        snake.rep.add(new Repertoire("Python Africain"));
        zboub.rep.add(new Repertoire ("Poil Long"));
        zboub.rep.add(new Repertoire("Poil Court"));
        // print de l' arborescencess
        System.out.println(racine.nom + ":");
        for (Repertoire lvl0 : racine.rep) {
            System.out.println("\t" + lvl0.nom);
            for (Repertoire lvl1 : lvl0.rep) {
                System.out.println("\t\t" + lvl1.nom);
                for (Repertoire lvl2 : lvl1.rep) {
                    System.out.println("\t\t\t" + lvl2.nom);
                    for (Repertoire lvl3 : lvl2.rep) {
                        System.out.println("\t\t\t\t" + lvl3.nom);
                        for (Repertoire lvl4 : lvl3.rep) {
                            System.out.println("\t\t\t\t\t" + lvl4.nom);
                            for (Repertoire lvl5 : lvl4.rep) {
                                System.out.println("\t\t\t\t\t\t" + lvl5.nom);
                            
                                for (Repertoire lvl6 : lvl5.rep) {
                                    System.out.println("\t\t\t\t\t\t\t" + lvl6.nom);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}