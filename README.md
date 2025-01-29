# BOMI Modeling Tool
## Setup the Development Workspace
1. Get an <code>Eclipse Modeling Tools</code> for your operating system from <link>https://www.eclipse.org/downloads/packages/</link>
1. Install all Sirius and Xtext Components via <code>Help</code> -> <code>Install New Software...</code>. In the corresponding wizard, select, e.g., <code>Latest Eclipse Simultaneous Release</code> in the topmost dropdown box. After loading has finished, type in <code>Sirius</code> and simply select and install all the resulting components. Do the same with typing <code>Xtext</code> and install the "Xtext Complete SDK". 
1. Pull this repo and import all the projects in the folder <code>plugins</code>. Best done directly in the Eclipse Git perspective (open via, e.g., <code>Window</code> -> <code>Perspective</code> -> <code>Open Perspective</code> -> <code>Git</code>), but you can also pull the repo in a different way and then import the projects.
1. In the project <code>se.gu.cse.idxse.bomi.text</code>, navigate to the file <code>src/se.gu.cse.idxse.bomi.text/Bomi.xtext</code>. Generate the Xtext editor infrastructure by right-clicking <code>Bomi.xtext</code> and selecting <code>Run as</code> -> <code>Generate Xtext Artifacts</code> (ignore the warning that there are errors in the project, because the errors will get removed after the code generation).


## Setup the Runtime Workspace
1. Right-click one of the projects in the development workspace and select <code>Run</code> -> <code>Run As</code> -> <code>Eclipse Application</code>. This launches the Eclipse runtime with an empty runtime workspace. 
1. If a dark theme is applied: For a better representation, switch the dark theme to a bright one via <code>Window</code> -> <code>Preferences</code> -> <code>General</code> -> <code>Appearance</code>. Under <code>Theme</code>, switch to <code>Classic</code> or <code>Light</code>.

### Import an Existing BOMI Model Example
1. From the folder <code>examples</code> in this repository, import the project <code>se.gu.cse.idxse.bomi.examples</code>.
1. Open the file <code>CompanyA_UserStories.aird</code> by double-clicking it. Under <code>Representations</code>, you can find diagrams for all BOMI view types that you can now explore. The actual BOMI model is persisted in the file <code>CompanyA_UserStories.bomi</code>.


### Create a BOMI Model from Scratch
1. Create a new general project (<code>File</code> -> <code>New</code> -> <code>Project...</code> -> <code>General</code> -> <code>Project</code>).
2. In this project, create a new .bomi file (<code>File</code> -> <code>New</code> -> <code>File</code>). Say "OK" on the prompt when asked whether the project should be converted to an Xtext project. 
3. In the project, create a representation file (right-click <code>.bomi</code> file -> <code>Representations File</code>). 
   - In the wizard, select <code>Initialization from a semantic resource</code>   
   - Finish the wizard by creating an <code>.aird</code> file.
4. Open the <code>.aird</code> file by double-clicking it. In the middle, select <code>BOMI Detailed Diagram</code> and create a new diagram via <code>New...</code> and complete the subsequent wizard. 
5. The empty BOMI editor opens. Create new nodes and edges by using the palette on the right-hand side, and fill out the details with the property editor in the bottom.
