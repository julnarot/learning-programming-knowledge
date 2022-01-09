package main

import "fmt"

type taskList struct {
	task []*task
}

func (t *taskList) addList(tl *task) {
	t.task = append(t.task, tl)
}

func (t *taskList) deleteByIndex(index int) {
	t.task = append(t.task[:index], t.task[index+1:]...)
}

func (t *taskList) printTask() {
	for _, tas := range t.task {
		fmt.Println("Name", tas.name)
		fmt.Println("Info", tas.description)
	}
}

func (t *taskList) printTaskCompletly() {
	for _, tas := range t.task {
		if tas.completed {
			fmt.Println("Name", tas.name)
			fmt.Println("Info", tas.description)
		}
	}
}

type task struct {
	name        string
	description string
	completed   bool
}

func (t *task) markCompleted() { //function with pointer
	t.completed = true
}

func (t *task) updateDescription(description string) { //function with pointer
	t.description = description
}
func (t *task) updateName(name string) { //function with pointer
	t.name = name
}

func main() {

	task1 := &task{name: "Excute sql sentece 1",
		description: " this task can acces tos...", completed: false}
	task2 := &task{name: "Excute sql sentece 2",
		description: " this task can acces tosgsdfgsfg...", completed: false}
	task3 := &task{name: "Excute sql sentece 3",
		description: " this task can acces tos...", completed: false}

	list := &taskList{
		task: []*task{
			task1, task2,
		},
	}

	fmt.Println(list.task[0])

	list.addList(task3)
	list.printTask()
	list.task[0].markCompleted()
	fmt.Println("Tareas completadas")
	list.printTaskCompletly()

	/*for i := 0; i<len(list.task); i++ {
		fmt.Println("i: ",i ,list.task[i].name)
	}*/

	/*	for index := 0; index < 10; index++ {
		if index == 2 {
			continue // this can jump iteration
		}
		if index == 7 {
			break // this can breakout  iteration
		}
		fmt.Println(index)
	}*/
	//
	//fmt.Println(len(list.task))
	//list.deleteByIndex(1)
	//fmt.Println(len(list.task))

	mapTasks := make(map[string]*taskList)

	mapTasks["MESTOR"] = list
	task4 := &task{name: "Excute sql sentece 4",
		description: " this task can acces tos...44", completed: false}
	task5 := &task{name: "Excute sql sentece 5",
		description: " this task can acces tos...55", completed: false}

	list2 := &taskList{
		task: []*task{
			task4, task5,
		},
	}

	mapTasks["RICARDO"] = list2

	fmt.Println("nestor's task")
	mapTasks["MESTOR"].printTask()
	fmt.Println("ricard's task")
	mapTasks["RICARDO"].printTask()
}
