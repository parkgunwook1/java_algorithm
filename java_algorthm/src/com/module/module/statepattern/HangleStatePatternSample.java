/*
package com.module.module.statepattern;

interface IHangleContext
{
    void setFirstChar(char c);
    void setMiddleChar(char c);
    void setLastChar(char c);
    void onComplete();
    void changeHangleInputState(IHanglInputState newstate);
}

interface IHanglInputState
{
    void addSon(IHangleContext context, char a);
    void addMom(IHangleContext context, char a);
}


class FirstInputState implements IHanglInputState
{
    static final FirstInputState instance = new FirstInputState();

    void addSon(IHangleContext context, char a){
	context.setFirstChar(a);
	context.changeHangleInputState(MiddleInputState.instance);
    }
    
    void addMom(IHangleContext context, char a){
	throw new Exception("input mode error");
    }
}

class MiddleInputState implements IHanglInputState
{
    static final MiddleInputState instance = new MiddleInputState();

    void addSon(IHangleContext context, char a){
	throw new Exception("input mode error");

    }
    
    void addMom(IHangleContext context, char a){
	context.setMiddleChar(a);
	context.changeHangleInputState(new LastInputState());
    }
}

class LastInputState implements IHanglInputState
{
    static final MiddleInputState instance = new MiddleInputState();
    void addSon(IHangleContext context, char a){
	context.setlastChar(a);
	context.oncomplete();
	context.changeHangleInputState(FirstInputState.instance);
    }
    
    void addMom(IHangleContext context, char a){
	throw new Exception("input mode error");
    }
}


class RealHangleContext implements IHangleContext{
    IHangleInputState currentState;
    void setFirstChar(char c);
    void setMiddleChar(char c);
    void setLastChar(char c);
    void onComplete();
    
    RealHangleContext(){
	currentState = FirstInputState.instance;
    }
    void changeHangleInputState(IHanglInputState newstate){
	currentState = newstate;
    }
    void addSon(char a){
	currentState.addSon(this,a);
    }
    void addMom(char a){
	currentState.addMom(this,a);
    }
}

*/
