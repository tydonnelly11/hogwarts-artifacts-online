package edu.tcu.cs.hogwartsartifactsonline.system;

import edu.tcu.cs.hogwartsartifactsonline.artifact.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.artifact.ArtifactRepository;
import edu.tcu.cs.hogwartsartifactsonline.wizard.Wizard;
import edu.tcu.cs.hogwartsartifactsonline.wizard.WizardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private final ArtifactRepository artifactRepository;

    private final WizardRepository wizardRepository;

    public DBDataInitializer(ArtifactRepository artifactRepository, WizardRepository wizardRepository){
        this.artifactRepository = artifactRepository;
        this.wizardRepository = wizardRepository;
    }
    @Override
    public void run(String... args) throws Exception{
        Artifact a1 = new Artifact();
        a1.setId("1250808601744904191");
        a1.setName("Invisibility Cloak1");
        a1.setDescription("An invisibility cloak is used to make the wearer invisible1.");
        a1.setImageUrl("ImageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904192");
        a2.setName("Invisibility Cloak2");
        a2.setDescription("An invisibility cloak is used to make the wearer invisible2.");
        a2.setImageUrl("ImageUrl");


        Artifact a3 = new Artifact();
        a3.setId("1250808601744904193");
        a3.setName("Invisibility Cloak3");
        a3.setDescription("An invisibility cloak is used to make the wearer invisible3.");
        a3.setImageUrl("ImageUrl");


        Artifact a4 = new Artifact();
        a4.setId("1250808601744904194");
        a4.setName("Invisibility Cloak4");
        a4.setDescription("An invisibility cloak is used to make the wearer invisible4.");
        a4.setImageUrl("ImageUrl");


        Artifact a5 = new Artifact();
        a5.setId("1250808601744904195");
        a5.setName("Invisibility Cloak5");
        a5.setDescription("An invisibility cloak is used to make the wearer invisible5.");
        a5.setImageUrl("ImageUrl");


        Artifact a6 = new Artifact();
        a6.setId("1250808601744904196");
        a6.setName("Invisibility Cloak7");
        a6.setDescription("An invisibility cloak is used to make the wearer invisible6.");
        a6.setImageUrl("ImageUrl");

        Wizard w1 = new Wizard();
        w1.setId(1);
        w1.setName("Albus Dumbledore");
        w1.addArtifact(a1);
        w1.addArtifact(a3);

        Wizard w2 = new Wizard();
        w2.setId(2);
        w2.setName("Harry Potter");
        w2.addArtifact(a2);
        w2.addArtifact(a4);

        Wizard w3 = new Wizard();
        w3.setId(3);
        w3.setName("Neville Longbottom");
        w3.addArtifact(a5);

        wizardRepository.save(w1);
        wizardRepository.save(w2);
        wizardRepository.save(w3);

        artifactRepository.save(a6);


    }
}
