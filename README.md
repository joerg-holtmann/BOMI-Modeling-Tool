# BOMI-Views
## Setup the Development Workspace
1. Get an <code>Eclipse Modeling Tools</code> for your operating system from <link>https://www.eclipse.org/downloads/packages/</link>
2. Install all Sirius Components via <code>Help</code> -> <code>Install New Software...</code>. In the corresponding wizard, select, e.g., <code>Latest Eclipse Simultaneous Release</code> in the topmost dropdown box. After loading has finished, type in <code>Sirius</code> and simply select and install all the resulting components.
3. Pull this repo and import the projects <code>se.gu.cse.idxse.bomi</code> and <code>se.gu.cse.idxse.bomi.design</code>. Best done directly in the Eclipse Git perspective (open via, e.g., <code>Window</code> -> <code>Perspective</code> -> <code>Open Perspective</code> -> <code>Git</code>), but you can also pull the repo in a different way and then import the projects.
4. Right-click one of the projects and select <code>Run</code> -> <code>Run As</code> -> <code>Eclipse Application</code>. This launches the Eclipse runtime with an empty runtime workspace (cf. next section). 

## Setup the Runtime Workspace
1. Create a new general project (<code>File</code> -> <code>New</code> -> <code>Project...</code> -> <code>General</code> -> <code>Project</code>).
2. In this project, create a new .bomi file (<code>File</code> -> <code>New</code> -> <code>Other...</code>) -> <code>Example EMF Model Creation Wizards</code> -> <code>Bomi Model</code>). In the final dialog, select in the topmost dropdown box <code>BOMI Model</code> as <code>Model Object</code>. The resulting .bomi file gets only opened in the plain tree and property editor without diagrams, which we add in the next step.
3. In the project, create a representation file (Right-click project -> <code>Representations File</code>). 
   - In the wizard, select <code>Initialization from a semantic resource</code>
   - On the next page, select the project and the .bomi file.
   - Finish the wizard by creating an .aird file.
4. Open the .aird file by double-clicking it. In the middle, select <code>BOMI Detailed Diagram</code> and create a new diagram via <code>New...</code> and complete the subsequent wizard. 
5. The empty BOMI editor opens. Create new nodes and edges by using the palette on the right-hand side, and fill out the details with the property editor in the bottom.
