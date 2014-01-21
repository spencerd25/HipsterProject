package view;

import javax.swing.JFrame;

import controller.HipsterController;

public class HipsterFrame extends JFrame
{
		/**
		 * @author Spencer Davy
		 */
		private static final long serialVersionUID = 1L;

		private HipsterController baseController;
		
		private HipsterPanel basePanel;
		
		public HipsterFrame(HipsterController baseController)
		{
			this.setBaseController(baseController);
			basePanel = new HipsterPanel(baseController);
			
			setupFrame();
		}
		
		private void setupFrame()
		{
			this.setLocation(300, 200);
			this.setContentPane(basePanel);
			this.setSize(700, 600);
			this.setVisible(true);
		}

		public HipsterController getBaseController()
		{
			return baseController;
		}

		public void setBaseController(HipsterController baseController)
		{
			this.baseController = baseController;
		}
}
