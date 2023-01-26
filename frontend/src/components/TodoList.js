import React from 'react'
import "./TodoList.css"
import {RiDeleteBin3Fill, RiImageEditFill} from 'react-icons/ri';

function TodoList(props) {
    const {itemList} = props;

    return (
        <div>
            {itemList.map((val) => {
                return (
                    <div className="">
                        <div>
                            <span>{val.itemName}</span>
                        </div>
                        <div>
                            <RiDeleteBin3Fill style={{cursor: 'pointer'}} />
                            <RiImageEditFill style={{cursor: 'pointer'}} />
                        </div>
                    </div>
                )
            })}
        </div>
    )
}

export default TodoList;