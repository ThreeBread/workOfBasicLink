package pushGame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener, MouseListener,KeyListener
	{

		private int grade=0;
		
		/**
		 * 人的行，列号，以及左上角图片的位置，避免从（0,0）开始
		 */
		private int row=7,column=7,leftX=0,leftY=0;
		
		/**
		 * 地图的行列数
		 */
		private int mapRow=0,mapColumn=0;
		/**
		 * 屏幕的大小
		 */
		private int width=0,height=0;
		private boolean acceptKey=true;
		//程序要用的图片
		private Image pic[]=null;
		private byte[][] map=null;
		private ArrayList list=new ArrayList();
//		Sound sound;
		
		//关于格子状态的常量对应元素
		final byte WALL=1,Box=2,BOXONEND=3,END=4,MANDOWN=5,
				MANLEFT=6,MANRIGHT=7,MANUP=8,GRASS=9,MANDOWNONEND=10,
				MANLEFTONEND=11,MANRIGHTONEND=12,MANUPONEND=13;
				
		public GameFrame(){
			super("推箱子游戏");
			setSize(600,600);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocation(300, 20);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container cont=getContentPane();
			cont.setLayout(null);
			cont.setBackground(Color.black);
			getPic();
			width=this.getWidth();
			height=this.getHeight();
			this.setFocusable(true);
			initMap();
			this.addKeyListener(this);
			this.addMouseListener(this);
//			sound=new Sound();
//			sound.loadSound;
			
			
		}
		
		/**
		 * 初始化本关地图，清空信息，获取游戏区域大小和显示游戏的左上角位置
		 */
		public void initMap(){
			map=getMap(grade);
			list.clear();
			getMapSizeAndPosition();
			getManPosition();
			
		}
		
		/**
		 * 获取工人位置
		 */
		public void getManPosition(){
			for(int i=0;i<map.length;i++)
				for(int j=0;j<map[0].length;j++){
					if(map[i][j]==MANDOWN || map[i][j]==MANDOWNONEND ||
							map[i][j]==MANUP || map[i][j]==MANUPONEND ||
									map[i][j]==MANLEFT || map[i][j]==MANLEFTONEND ||
											map[i][j]==MANRIGHT || map[i][j]== MANRIGHTONEND
							){row=i;
							column=j;
							break;
						
					}
					
			}
		}
		
		/**
		 * 获得游戏区域大小，显示在游戏左上角
		 */
		private void getMapSizeAndPosition(){
			mapRow=map.length;
			mapColumn=map[0].length;
			leftX=(width-map[0].length*30)/2;
			leftY=(height-map.length*30)/2;
			System.out.println(leftX);
			System.out.println(leftY);
			System.out.println(mapRow);
			System.out.println(mapColumn);
		}
		
		/**
		 * 加载要显示的图片
		 */
		public void getPic(){
			pic=new Image[14];
			for(int i=0;i<13;i++){
				pic[i]=Toolkit.getDefaultToolkit().getImage("images\\pic"+i+".jpg");
			}
		}
		
		public byte grassOrEnd(byte man){
			byte result=GRASS;
			if(man==MANDOWNONEND || man==MANLEFTONEND || man==MANRIGHTONEND || man==MANUPONEND)
				result=END;
			return result;
		}
		
	@Override
	public void keyTyped(KeyEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void keyPressed(KeyEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void keyReleased(KeyEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void mouseClicked(
			MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void mousePressed(
			MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void mouseReleased(
			MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void mouseEntered(
			MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	@Override
	public void actionPerformed(
			ActionEvent e)
		{
			// TODO Auto-generated method stub
			
		}

	}
