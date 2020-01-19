package akey;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        this.add(panel);
        
        this.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                switch(e.getKeyCode()){
                    case KeyEvent.VK_A: {
                    try {
                        panel.clickC();
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_W: {
                    try {
                        panel.clickCS();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_S: {
                    try {
                        panel.clickD();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_E: {
                    try {
                        panel.clickDS();
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_D: {
                    try {
                        panel.clickE();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_F: {
                    try {
                        panel.clickF();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_T: {
                    try {
                        panel.clickFS();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_G: {
                    try {
                        panel.clickG();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_Y: {
                    try {
                        panel.clickGS();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_H: {
                    try {
                        panel.clickA();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_U: {
                    try {
                        panel.clickAS();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_J: {
                    try {
                        panel.clickB();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                    case KeyEvent.VK_K: {
                    try {
                        panel.clickC2();
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(KeyFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
break;
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e){
                switch(e.getKeyCode()){
                    case KeyEvent.VK_A: panel.releaseC(); break;
                    case KeyEvent.VK_W: panel.releaseCS(); break;
                    case KeyEvent.VK_S: panel.releaseD(); break;
                    case KeyEvent.VK_E: panel.releaseDS(); break;
                    case KeyEvent.VK_D: panel.releaseE(); break;
                    case KeyEvent.VK_F: panel.releaseF(); break;
                    case KeyEvent.VK_T: panel.releaseFS(); break;
                    case KeyEvent.VK_G: panel.releaseG(); break;
                    case KeyEvent.VK_Y: panel.releaseGS(); break;
                    case KeyEvent.VK_H: panel.releaseA(); break;
                    case KeyEvent.VK_U: panel.releaseAS(); break;
                    case KeyEvent.VK_J: panel.releaseB(); break;
                    case KeyEvent.VK_K: panel.releaseC2(); break;
                }
            }
        });
        
        this.setUndecorated(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/3);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(),50, 50));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class Panel extends JPanel{
    JPanel c,d,e,f,g,a,b,c2;
    JPanel ch, dh, dh2, eh, fh, gh, gh2, ah, ah2, bh;
    JPanel csk,dsk,fsk,gsk,ask;
    Clip cm, csm, dm, dsm, em, fm, fsm, gm, gsm, am, asm, bm, c2m;
    
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
    
    public void clickC() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("c.wav").getAbsoluteFile());
        cm = AudioSystem.getClip();
        cm.open(csys);
        c.setBackground(Color.LIGHT_GRAY);
        ch.setBackground(Color.LIGHT_GRAY);
        cm.start();
    }
    
    public void clickCS() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("cs.wav").getAbsoluteFile());
        csm = AudioSystem.getClip();
        csm.open(csys);
        csk.setBackground(Color.GRAY);
        csm.start();
    }
    
    public void clickD() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("d.wav").getAbsoluteFile());
        dm = AudioSystem.getClip();
        dm.open(csys);
        d.setBackground(Color.LIGHT_GRAY);
        dh.setBackground(Color.LIGHT_GRAY);
        dh2.setBackground(Color.LIGHT_GRAY);
        dm.start();
    }
    
    public void clickDS() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("ds.wav").getAbsoluteFile());
        dsm = AudioSystem.getClip();
        dsm.open(csys);
        dsk.setBackground(Color.GRAY);
        dsm.start();
    }
    
    public void clickE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("e.wav").getAbsoluteFile());
        em = AudioSystem.getClip();
        em.open(csys);
        e.setBackground(Color.LIGHT_GRAY);
        eh.setBackground(Color.LIGHT_GRAY);
        em.start();
    }
    
    public void clickF() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("f.wav").getAbsoluteFile());
        fm = AudioSystem.getClip();
        fm.open(csys);
        f.setBackground(Color.LIGHT_GRAY);
        fh.setBackground(Color.LIGHT_GRAY);
        fm.start();
    }
    
    public void clickFS() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("fs.wav").getAbsoluteFile());
        fsm = AudioSystem.getClip();
        fsm.open(csys);
        fsk.setBackground(Color.GRAY);
        fsm.start();
    }
    
    public void clickG() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("g.wav").getAbsoluteFile());
        gm = AudioSystem.getClip();
        gm.open(csys);
        g.setBackground(Color.LIGHT_GRAY);
        gh.setBackground(Color.LIGHT_GRAY);
        gh2.setBackground(Color.LIGHT_GRAY);
        gm.start();
    }
    
    public void clickGS() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("gs.wav").getAbsoluteFile());
        gsm = AudioSystem.getClip();
        gsm.open(csys);
        gsk.setBackground(Color.GRAY);
        gsm.start();
    }
    
    public void clickA() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("a.wav").getAbsoluteFile());
        am = AudioSystem.getClip();
        am.open(csys);
        a.setBackground(Color.LIGHT_GRAY);
        ah.setBackground(Color.LIGHT_GRAY);
        ah2.setBackground(Color.LIGHT_GRAY);
        am.start();
    }
    
    public void clickAS() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("as.wav").getAbsoluteFile());
        asm = AudioSystem.getClip();
        asm.open(csys);
        ask.setBackground(Color.GRAY);
        asm.start();
    }
    
    public void clickB() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("b.wav").getAbsoluteFile());
        bm = AudioSystem.getClip();
        bm.open(csys);
        b.setBackground(Color.LIGHT_GRAY);
        bh.setBackground(Color.LIGHT_GRAY);
        bm.start();
    }
    
    public void clickC2() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        AudioInputStream csys = AudioSystem.getAudioInputStream(new File("c2.wav").getAbsoluteFile());
        c2m = AudioSystem.getClip();
        c2m.open(csys);
        c2.setBackground(Color.LIGHT_GRAY);
        c2m.start();
    }
    
    public void releaseC(){
        c.setBackground(Color.WHITE);
        ch.setBackground(Color.WHITE);
        cm.stop();
    }
    
    public void releaseCS(){
        csk.setBackground(Color.BLACK);
        csm.stop();
    }
    
    public void releaseD(){
        d.setBackground(Color.WHITE);
        dh.setBackground(Color.WHITE);
        dh2.setBackground(Color.WHITE);
        dm.stop();
    }
    
    public void releaseDS(){
        dsk.setBackground(Color.BLACK);
        dsm.stop();
    }
    
    public void releaseE(){
        e.setBackground(Color.WHITE);
        eh.setBackground(Color.WHITE);
        em.stop();
    }
    
    public void releaseF(){
        f.setBackground(Color.WHITE);
        fh.setBackground(Color.WHITE);
        fm.stop();
    }
    
    public void releaseFS(){
        fsk.setBackground(Color.BLACK);
        fsm.stop();
    }
    
    public void releaseG(){
        g.setBackground(Color.WHITE);
        gh.setBackground(Color.WHITE);
        gh2.setBackground(Color.WHITE);
        gm.stop();
    }
    
    public void releaseGS(){
        gsk.setBackground(Color.BLACK);
        gsm.stop();
    }
    
    public void releaseA(){
        a.setBackground(Color.WHITE);
        ah.setBackground(Color.WHITE);
        ah2.setBackground(Color.WHITE);
        am.stop();
    }
    
    public void releaseAS(){
        ask.setBackground(Color.BLACK);
        asm.stop();
    }
    
    public void releaseB(){
        b.setBackground(Color.WHITE);
        bh.setBackground(Color.WHITE);
        bm.stop();
    }
    
    public void releaseC2(){
        c2.setBackground(Color.WHITE);
        c2m.stop();
    }
}