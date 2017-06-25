<h3 style="text-align: right;"><span style="color: #000000;">26/06/2017</span></h3>
<h3 style="text-align: left;"><span style="color: #000000;">Gildas Cousin | Nicolas Hurtevent | Florian Vouters</span></h3>
<h1 style="text-align: center;"><span style="text-decoration: underline;"><span style="color: #808080; text-decoration: underline;">Java project : BoulderDash</span></span></h1>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2 style="text-align: center;">1. Project presentation</h2>
<p><img style="margin: 50px 300px 50px 300px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498399249-capture.png" alt="" width="441" height="193" align="middle" />For this project, we have to remake an old game which is called BoulderDash.</p>
<p>The goal of this game is to pick up all the diamonds on the map to open a door that permit us to go into the next level.</p>
<p>The character have to dig the dirt to make his way. <span id="result_box" class="short_text" lang="en"><span class="">He must be careful not to be crushed by a rock or a diamond and not be touched by an enemy. Some levels don't have diamonds. The players have to generate one by killing an enemy with a rock.</span></span></p>
<p><span class="short_text" lang="en"><span class="">We have to create 5 differents levels which can be access by the code and are saved in a database.</span></span></p>
<h2 style="text-align: center;"><span class="short_text" lang="en"><span class="">2. Project management</span></span></h2>
<p>At the start of the project, we made a task list together to know everything we need to do. Here a picture of what it looks like :</p>
<p><img style="margin-right: 150px; margin-left: 150px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498400281-tasks.png" alt="" width="736" height="730" /></p>
<p>&nbsp;To manage our project we used some tools. First of all, we used Github to have the code in common. With the help of Github, everyone in the group could work on his own part.</p>
<p>To communicate, we used two differents tools, Facebook and Discord.</p>
<p>We have done a WBS and a PBS :</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><img style="margin-right: 100px; margin-left: 100px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498400627-pbs.png" alt="" width="913" height="338" /> <img src="http://image.noelshack.com/fichiers/2017/25/7/1498400627-wbs.png" alt="" /></p>
<p>In this two diagrams, we can see all the tasks we have to do and the deliverables we have deliver at the end of the project.</p>
<h2 style="text-align: center;">3. UML</h2>
<p>We had to make the uml of the project.</p>
<p>UML is a modeling language which can permit you to make differents diagrams of the code of your project. It permit you to have a graphic visual of the program.</p>
<p>Here is the component diagram of the program :</p>
<p><img style="margin-right: 250px; margin-left: 250px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498405233-component.png" alt="" width="566" height="302" /></p>
<p>The view class diagram :</p>
<p><img style="margin-right: 100px; margin-left: 100px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498405348-view.png" alt="" width="878" height="544" /></p>
<p>The model and contract class diagrams :</p>
<p><img src="http://image.noelshack.com/fichiers/2017/25/7/1498405811-model1.png" alt="" width="1048" height="497" /></p>
<p><img src="http://image.noelshack.com/fichiers/2017/25/7/1498405811-model2.png" alt="" width="1051" height="643" /></p>
<p>The controller class diagram :</p>
<p><img style="margin-right: 100px; margin-left: 100px;" src="http://image.noelshack.com/fichiers/2017/25/7/1498407931-controller.png" alt="" width="849" height="384" /></p>
<p>&nbsp;</p>
<h2 style="text-align: center;">4. Pattern MVC</h2>
<h3>4.1 Model</h3>
<p>The model is the central part of the system, it contains all the informations needed for the game: the timer, the score the objective and obviously all the elements which constitute the map. Its sole purpose is to store the data so they can be read and displayed by the view and modified by the controller</p>
<p>&nbsp;</p>
<h3>4.2 Controller</h3>
<p>The controller needs to to be the game engine, that's it who create the model, and the view, by the fact to launch the view, it starts the CHI.</p>
<p>It does the main character controll, by waiting a key pressed by the view, and interact with the model to "tell it" what it needs to move, or to do, after that, the controller call the enemy move method and the rocks and diamond falling.</p>
<p>&nbsp;</p>
<h3>4.3 View</h3>
<p>&nbsp;</p>
<h3>4.4 Database</h3>
<p>The database store all the informations needed to load the level: it contains the height and width of the map as well as the number of diamonds needed to complete the level and of course the map itself as a string a character</p>
<p>&nbsp;</p>
<h3>4.5 Contract</h3>
<p>The contract makes it possible to link all the other packets between them and thus to make them work together, it is him who regroups all the interfaces of each of the parts, and each part calls upon him if necessary, we defined and finished it first Which allowed us to work on our own to finish this project</p>
