package akey;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Asif Rasheed, Rawan Suwwan
 */
public class KeyFrame extends JFrame{
    public KeyFrame(){
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/3);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,1));
        this.add(new Panel());
        
        this.setUndecorated(true);
        this.setVisible(true);
    }
}

class Panel extends JPanel{
    JPanel c,d,e,f,g,a,b,c2;
    JPanel ch, dh, dh2, eh, fh, gh, gh2, ah, ah2, bh;
    JPanel csk,dsk,fsk,gsk,ask;
    Clip cm, csm, dm, dsm, em, fm, fsm, gm, gsm, am, asm, bm, c2m;
    
    {
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("c.wav").getAbsoluteFile());
            cm = AudioSystem.getClip();
            cm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("cs.wav").getAbsoluteFile());
            csm = AudioSystem.getClip();
            csm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("d.wav").getAbsoluteFile());
            dm = AudioSystem.getClip();
            dm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("ds.wav").getAbsoluteFile());
            dsm = AudioSystem.getClip();
            dsm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("e.wav").getAbsoluteFile());
            em = AudioSystem.getClip();
            em.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("f.wav").getAbsoluteFile());
            fm = AudioSystem.getClip();
            fm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("fs.wav").getAbsoluteFile());
            fsm = AudioSystem.getClip();
            fsm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("g.wav").getAbsoluteFile());
            gm = AudioSystem.getClip();
            gm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("gs.wav").getAbsoluteFile());
            gsm = AudioSystem.getClip();
            gsm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("a.wav").getAbsoluteFile());
            am = AudioSystem.getClip();
            am.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("as.wav").getAbsoluteFile());
            asm = AudioSystem.getClip();
            asm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("b.wav").getAbsoluteFile());
            bm = AudioSystem.getClip();
            bm.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            AudioInputStream csys = AudioSystem.getAudioInputStream(new File("c2.wav").getAbsoluteFile());
            c2m = AudioSystem.getClip();
            c2m.open(csys);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Panel(){
        this.setBackground(Color.GRAY);
        this.setLayout(new GridLayout(1,14));
        
        /*<-----C----->*/
        c = new JPanel(new BorderLayout());
        c.setBackground(Color.WHITE);
        c.add(new JLabel("<html><h1><b>C</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(c);
        
        JPanel cs = new JPanel(new GridLayout(2,1));
        csk = new JPanel(new BorderLayout());
        csk.setBackground(Color.BLACK);
        csk.add(new JLabel("<html><h1><font color='white'><b>C#</b></font></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        cs.add(csk);
        JPanel cse = new JPanel(new GridLayout(1,2));
        ch = new JPanel();
        ch.setBackground(Color.WHITE);
        ch.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        dh = new JPanel();
        dh.setBackground(Color.WHITE);
        cse.add(ch);
        cse.add(dh);
        cse.setBackground(Color.WHITE);
        cs.add(cse);
        this.add(cs);
        
        /*<-----D----->*/
        d = new JPanel(new BorderLayout());
        d.setBackground(Color.WHITE);
        d.add(new JLabel("<html><h1><b>D</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(d);
        
        JPanel ds = new JPanel(new GridLayout(2,1));
        dsk = new JPanel(new BorderLayout());
        dsk.setBackground(Color.BLACK);
        dsk.add(new JLabel("<html><h1><font color='white'><b>D#</b></font></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        ds.add(dsk);
        JPanel dse = new JPanel(new GridLayout(1,2));
        dse.setBackground(Color.WHITE);
        dh2 = new JPanel();
        dh2.setBackground(Color.WHITE);
        dh2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        eh = new JPanel();
        eh.setBackground(Color.WHITE);
        dse.add(dh2);
        dse.add(eh);
        
        ds.add(dse);
        this.add(ds);
        
        /*<-----E----->*/
        e = new JPanel(new BorderLayout());
        e.setBackground(Color.WHITE);
        e.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        e.add(new JLabel("<html><h1><b>E</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(e);
        
        /*<-----F----->*/
        f = new JPanel(new BorderLayout());
        f.setBackground(Color.WHITE);
        f.add(new JLabel("<html><h1><b>F</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(f);
        
        JPanel fs = new JPanel(new GridLayout(2,1));
        fsk = new JPanel(new BorderLayout());
        fsk.setBackground(Color.BLACK);
        fsk.add(new JLabel("<html><h1><font color='white'><b>F#</b></font></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        fs.add(fsk);
        JPanel fse = new JPanel(new GridLayout(1,2));
        fse.setBackground(Color.WHITE);
        fh = new JPanel();
        fh.setBackground(Color.WHITE);
        fh.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        gh = new JPanel();
        gh.setBackground(Color.WHITE);
        fse.add(fh);
        fse.add(gh);
        fs.add(fse);
        this.add(fs);
        
        /*<-----G----->*/
        g = new JPanel(new BorderLayout());
        g.setBackground(Color.WHITE);
        g.add(new JLabel("<html><h1><b>G</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(g);
        
        JPanel gs = new JPanel(new GridLayout(2,1));
        gsk = new JPanel(new BorderLayout());
        gsk.setBackground(Color.BLACK);
        gsk.add(new JLabel("<html><h1><font color='white'><b>G#</b></font></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        gs.add(gsk);
        JPanel gse = new JPanel(new GridLayout(1,2));
        gse.setBackground(Color.WHITE);
        gh2 = new JPanel();
        gh2.setBackground(Color.WHITE);
        gh2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        ah = new JPanel();
        ah.setBackground(Color.WHITE);
        gse.add(gh2);
        gse.add(ah);
        gs.add(gse);
        this.add(gs);
        
        /*<-----A----->*/
        a = new JPanel(new BorderLayout());
        a.setBackground(Color.WHITE);
        a.add(new JLabel("<html><h1><b>A</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(a);
        
        JPanel as = new JPanel(new GridLayout(2,1));
        ask = new JPanel(new BorderLayout());
        ask.setBackground(Color.BLACK);
        ask.add(new JLabel("<html><h1><font color='white'><b>A#</b></font></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        as.add(ask);
        JPanel ase = new JPanel(new GridLayout(1,2));
        ah2 = new JPanel();
        ah2.setBackground(Color.WHITE);
        ah2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        bh = new JPanel();
        bh.setBackground(Color.WHITE);
        ase.add(ah2);
        ase.add(bh);
        ase.setBackground(Color.WHITE);
        as.add(ase);
        this.add(as);
        
        /*<-----B----->*/
        b = new JPanel(new BorderLayout());
        b.setBackground(Color.WHITE);
        b.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
        b.add(new JLabel("<html><h1><b>B</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(b);
        
        /*<-----C2----->*/
        c2 = new JPanel(new BorderLayout());
        c2.setBackground(Color.WHITE);
        c2.add(new JLabel("<html><h1><b>C</b></h1></html>", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        this.add(c2);
    }
}