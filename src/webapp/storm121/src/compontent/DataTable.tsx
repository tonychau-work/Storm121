import React from "react";

type TableRowProps = {
    row: any[];
    onClick?: () => void;
};

export const TableRow: React.FC<TableRowProps> = (props) => {
    return (
        <>
            {props.row.map((value, index) => (
                <td key={index} onClick={props.onClick}>{value}</td>
            ))}
        </>
    );
};
