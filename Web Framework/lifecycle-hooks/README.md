# Angular lifecycle hooks

Order of invocation of the Angular lifecycle hooks are -

<ul>
    <li><code>constructor</code></li>
    <li><code>ngOnchanges</code></li>
    <li><code>ngOnInit</code></li>
    <li><code>ngDoCheck</code></li>
    <li><code>ngAfterContentInit</code></li>
    <li><code>ngAfterContentChecked</code></li>
    <li><code>ngAfterViewInit</code></li>
    <li><code>ngAfterViewChecked</code></li>
    <li><code>ngOnDestroy</code></li>
</ul>

Angular executes hook methods in the following sequence.

0. `constructor`
Default method which is called when the class is instantiated.

1. `ngOnChanges`
Fired when Angular sets or resets data-bound input properties or a new component is created.

2. `ngOnInit`
Called once the component/directive is initialized.

3. `ngDoCheck`
Fires when change detection runs.

4. `ngAfterContentInit`
Fired when content(`ng-content`) has been projected into the view.

5. `ngAfterContentChecked`
Fired after every projected content has been checked.

6. `ngAfterViewInit`
Fired after the components view and the child view has been initialized.

7. `ngAfterViewChecked`
Fired every time the view and the child view has been checked.

8. `ngOnDestroy`
Called once when Angular is about to destroy directive/component. Clean-up logic like detaching from observables and detaching from event handlers are done in here to avoid memory leaks.