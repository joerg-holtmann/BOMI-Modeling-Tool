# BOMI-Views
## Setup the Development Workspace
1. Get an <code>Eclipse Modeling Tools</code> for your operating system from <link>https://www.eclipse.org/downloads/packages/</link>
1. Install all Sirius and Xtext Components via <code>Help</code> -> <code>Install New Software...</code>. In the corresponding wizard, select, e.g., <code>Latest Eclipse Simultaneous Release</code> in the topmost dropdown box. After loading has finished, type in <code>Sirius</code> and simply select and install all the resulting components. Do the same with typing <code>Xtext</code> and install the "Xtext Complete SDK". 
1. Pull this repo and import all the projects <code>se.gu.cse.idxse.bomi<.x></code>. Best done directly in the Eclipse Git perspective (open via, e.g., <code>Window</code> -> <code>Perspective</code> -> <code>Open Perspective</code> -> <code>Git</code>), but you can also pull the repo in a different way and then import the projects.
1. Create an empty folder <code>src</code> for the project <code>se.gu.cse.idxse.bomi</code> via Right-click -> <code>New</code> -> <code>Folder</code>. 
1. In the project <code>se.gu.cse.idxse.bomi.text</code>:
   - If there are error messages and the folders <code>src-gen</code> or <code>xtend-gen</code> do not exist, create these folders.
   - Navigate to the file <code>src/se.gu.cse.idxse.bomi.text/Bomi.xtext</code>. Generate the Xtext editor infrastructure by right-clicking <code>Bomi.xtext</code> and selecting <code>Run as</code> -> <code>Generate Xtext Artifacts</code>.
1. Right-click one of the projects and select <code>Run</code> -> <code>Run As</code> -> <code>Eclipse Application</code>. This launches the Eclipse runtime with an empty runtime workspace (cf. next section). 

## Setup the Runtime Workspace
1. Create a new general project (<code>File</code> -> <code>New</code> -> <code>Project...</code> -> <code>General</code> -> <code>Project</code>).
2. In this project, create a new .bomi file (<code>File</code> -> <code>New</code> -> <code>File</code>). Say "OK" on the prompt when asked whether the project should be converted to an Xtext project. 
3. In the project, create a representation file (right-click .bomi file -> <code>Representations File</code>). 
   - In the wizard, select <code>Initialization from a semantic resource</code>   
   - Finish the wizard by creating an .aird file.
4. Open the .aird file by double-clicking it. In the middle, select <code>BOMI Detailed Diagram</code> and create a new diagram via <code>New...</code> and complete the subsequent wizard. 
5. The empty BOMI editor opens. Create new nodes and edges by using the palette on the right-hand side, and fill out the details with the property editor in the bottom.
