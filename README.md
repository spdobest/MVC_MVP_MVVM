# MVC_MVP_MVVM
This repository explains the use of MVC,MVP and MVVM design pattern. It will also explains where to use the Design patterns and where not. it will differentiate the three Design pattern.It will also show the data flow diagram of each design pattern.

## MVC
It is the most used Design pattern Before. Its veri simple and easy to Implement. Mainly it have 3 modules.
1. Model
2. View
3. Controller

### MODEL
Model means , it contains all the data need to display in the view. It also have the data that represent the view.It also defines the business rules for data means as how the data can be changed and manipulated.Its nothing but the Old POJO classes to hold the data.
### VIEW
The View represents UI components like XML, HTML etc. View displays the data that is received from the controller as the outcome. In MVC pattern View monitors the model for any state change and displays updated model.Its the main Presentation Lavel of the application. Its notthing but the XMl in android, HTML in web application. its responsibility only to show the data in the view.
###Controller
The Controller is responsible to process incoming requests. It processes the user’s data through the Model and passing back the results to View. It normally acts as a mediator between the View and the Model.

### ADVANTAGES OF MVC

1. Faster development process: MVC supports rapid and parallel development. With MVC, one programmer can work on the view while other can work on the controller to create business logic of the web application. The application developed using MVC can be three times faster than application developed using other development patterns.

2. Ability to provide multiple views: In the MVC Model, you can create multiple views for a model. Code duplication is very limited in MVC because it separates data and business logic from the display.

3. Support for asynchronous technique: MVC also supports asynchronous technique, which helps developers to develop an application that loads very fast.

4. Modification does not affect the entire model: Modification does not affect the entire model because model part does not depend on the views part. Therefore, any changes in the Model will not affect the entire architecture.

5. MVC model returns the data without formatting: MVC pattern returns data without applying any formatting so the same components can be used and called for use with any interface.

6. SEO friendly Development platform: Using this platform, it is very easy to develop SEO-friendly URLs to generate more visits from a specific application.

### DISADVANTAGES OF MVC

1. THe model is always tightly coupled with View 

2. Increased complexity

3. Inefficiency of data access in view

4. Difficulty of using MVC with modern user interface.

5. Need multiple programmers

6. Knowledge on multiple technologies is required.

7) Developer have knowledge of client side code and html code.

 ### DIAGRAM OF MVC
![alt tag](https://github.com/spdobest/MVC_MVP_MVVM/blob/master/images/mvc.png)


## MVP - Model View Presenter
NOw a days It's  the most used Design pattern. Its modularise the whole project into different parts
1. Model     - Its holds the data
2. View      - Its SHow the data
3. Presenter - Its the layer between Model and View

Technically Presenter,Interactor, View are the main Components of MVP
### Presenter 
its the Layer between Interactor and View, When we pass any network call from View to Interactor, the call Gopes through Pre

### Diagram of MVP
![alt tag](https://github.com/spdobest/MVC_MVP_MVVM/blob/master/images/mvp.png)

## MVVM - Model View  Viewmodel
MVVM pattern supports two-way data binding between View and View-Model. This allows automatic propagation of changes, inside the state of View-Model to the View. Generally, the View-Model utilizes the observer pattern to inform changes in the View-Model to the Model.

#### ViewModel
It is responsible for exposing methods, commands, and other properties that help to maintain the state of the view, manipulate the model as the result of actions on the view, and trigger events in the view itself. View has a reference to View-Model but View-Model has no information about the View. There is many-to-one relationship between View and View-Model means many Views can be mapped to one View-Model. It is completely independent of Views.
The bi-directional data binding or the two way data binding between the view and the View-Model ensures that the models and properties in the View-Model is in sync with the view. The MVVM design pattern is well suited in applications that need support for bi-directional data binding.


NOw a days It's  the most used Design pattern. Its modularise the whole project into different parts
1. Model     - Its holds the data
2. View      - In MVVM model, we only pass the Viewmodel object which contains Model/Data for the View to set. THe ViewModels work is to set the data to the View.
3. ViewModel - Its the layer between Model and View, which holds all the business logic
 
### Model 
its the Layer between Interactor and View, When we pass any network call from View to Interactor, the call Gopes through Pre

### View 
its the Layer between Interactor and View, When we pass any network call from View to Interactor, the call Gopes through Pre

### Viewmodel
its the Layer between Interactor and View, When we pass any network call from View to Interactor, the call Gopes through Pre

### Diagram of MVP
![alt tag](https://github.com/spdobest/MVC_MVP_MVVM/blob/master/images/mvvm.png)



### Graphical Comparison between MVC,MVP,MVVM
![alt tag](https://github.com/spdobest/MVC_MVP_MVVM/blob/master/images/mvc_mvp_mvvm.png)


### Difference and Use of MVC, MVP, MVVM

#### MVC :
Use in situations where the connection between the view and the rest of the program is not always available (and you can’t effectively employ MVVM or MVP).
This clearly describes the situation where a web API is separated from the data sent to the client browsers.  Microsoft’s ASP.NET MVC is a great tool for managing such situations and provides a very clear MVC framework.

#### MVP:
Use in situations where binding via a datacontext is not possible.
Windows Forms is a perfect example of this.  In order to separate the view from the model, a presenter is needed.  Since the view cannot directly bind to the presenter, information must be passed to it view an interface (IView).

#### MVVM:
Use in situations where binding via a datacontext is possible.  Why?  The various IView interfaces for each view are removed which means less code to maintain.
Some examples where MVVM is possible include WPF and javascript projects using Knockout.

## Android Architecture Components

**Lets explain the problems with the existing code without the lifecycle aware component.**  
Let's  call a Booking Taxi application where the user will always see the location on the map. WHen the screen comes to Foreground, the location of user and taxi will be shown in the map and in onPause we jave to remove.  
  
In our activity or Fragment class, in OnStart or onResume method we will register the callBack for Location Services, we make Start the Location Service , fetch the data and show the loaction in the Google Map. and in onPause we will  remove the Location service callback of Location services.  
  
This is How we do in general.  
  
class MyLocationListener {  
    public MyLocationListener(Context context, Callback callback) {  
        // ...   
    }  
    void start() {  
        // connect to system location service  
    }  
    void stop() {  
        // disconnect from system location service  
    }  
}    
  
public class SHowMyPositionActivity extends AppCompatActivity {  
    private MyLocationListener myLocationListener;  
  
    @Override  
    public void onCreate(...) {  
        myLocationListener = new MyLocationListener(this, (location) -> {  
            // update UI  
        });   
    }  
    @Override   
    public void onStart() {  
        super.onStart();  
        myLocationListener.start();  
        // manage other components that need to respond  
        // to the activity lifecycle  
    }  
    @Override 
    public void onStop() {  
        super.onStop();  
        myLocationListener.stop();  
        // manage other components that need to respond  
        // to the activity lifecycle  
    }  
}  
  
1. We have to write a lots of complex code in the onStart() and onStop() method to Start the LocationServie and to stop the location Service.  
2. Sometime in our application onStop  called before onStart. on Immediate configuration change, the activity recreated by calling onStop() methos. Its very difficult to maintain the life cycle .  
  
TO overcome the above problem , Google came with a solution which is called LifecyclerAware.  


There are 4 main Building Bolcks of Android Architecture Component  
1. LifecyclerOwner  
2. LifecyclerObserver  
3. ViewModel  
4. Mvvm  
  
**Lifecycle** is a class which holds the lifecycle state of the android Component (Like Fragment, Activity etc) and allows other classes to Observ the state of the Component  
  
Lifecycle uses two main enumerations to track the lifecycle status for its associated component:  
  
Event  
The lifecycle events that are dispatched from the framework and the Lifecycle class. These events map to the callback events in activities and fragments.  
State  
The current state of the component tracked by the Lifecycle object.  
 
    
**Example**  
  
public class MyObserver implements LifecycleObserver {  
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)  
    public void connectListener() {  
        ...  
    }  
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)  
    public void disconnectListener() {  
        ...  
    }  
}  
myLifecycleOwner.getLifecycle().addObserver(new MyObserver());    
 
 




