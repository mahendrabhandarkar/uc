import React, {useState} from 'react'
import logo from './logo.svg';
import './App.css';
import uuid from 'react-uuid';
import todoList from "./components/TodoList";
import TodoList from './components/TodoList';

function App() {
  const [item, setItem] = useState("");
  const [itemList, setItemList] = useState([]);

  function handleChange(e) {
    setItem(e.target.value);
  }
  function addItem() {
    const itemObj = {id: uuid(), itemName: item}
    setItemList((prevItem) => [...prevItem, itemObj]);
    setItem("");
  }

  return (
    <div className="App">
      <div>
        <input type="search" placeholder='to-do' value={item} onChange={handleChange}/>
      </div>
      <div>
        <button className="add_btn">Add Button</button>
        <button class="delete_btn">Delete All Button</button>
      </div>
      <div>
        <TodoList itemList={itemList} />
      </div>
    </div>
  );
}

export default App;
