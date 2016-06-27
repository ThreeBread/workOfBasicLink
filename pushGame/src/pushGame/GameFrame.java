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
		 * �˵��У��кţ��Լ����Ͻ�ͼƬ��λ�ã�����ӣ�0,0����ʼ
		 */
		private int row=7,column=7,leftX=0,leftY=0;
		
		/**
		 * ��ͼ��������
		 */
		private int mapRow=0,mapColumn=0;
		/**
		 * ��Ļ�Ĵ�С
		 */
		private int width=0,height=0;
		private boolean acceptKey=true;
		//����Ҫ�õ�ͼƬ
		private Image pic[]=null;
		private byte[][] map=null;
		private ArrayList list=new ArrayList();
//		Sound sound;
		
		//���ڸ���״̬�ĳ�����ӦԪ��
		final byte WALL=1,Box=2,BOXONEND=3,END=4,MANDOWN=5,
				MANLEFT=6,MANRIGHT=7,MANUP=8,GRASS=9,MANDOWNONEND=10,
				MANLEFTONEND=11,MANRIGHTONEND=12,MANUPONEND=13;
				
		public GameFrame(){
			super("��������Ϸ");
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
		 * ��ʼ�����ص�ͼ�������Ϣ����ȡ��Ϸ�����С����ʾ��Ϸ�����Ͻ�λ��
		 */
		public void initMap(){
			map=getMap(grade);
			list.clear();
			getMapSizeAndPosition();
			getManPosition();
			
		}
		
		/**
		 * ��ȡ����λ��
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
		 * �����Ϸ�����С����ʾ����Ϸ���Ͻ�
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
		 * ����Ҫ��ʾ��ͼƬ
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
