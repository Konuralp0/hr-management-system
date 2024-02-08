import React,  {useState,useEffect} from 'react'
import JobPositionService from '../services/jobPositionService'
import {
    TableRow,
    TableHeaderCell,
    TableHeader,
    TableFooter,
    TableCell,
    TableBody,
    MenuItem,
    Icon,
    Menu,
    Table,
  } from 'semantic-ui-react'

export default function JobPositionList() {

    const [jobPosition, setjobPosition] = useState([])

    useEffect(()=>{

        let jobPositionService = new JobPositionService();
        jobPositionService.getJobPositions().then(result => setjobPosition(result.data.data))


    },[])
  
  
  
    return (
    <div>
       <Table celled>
                <TableHeader>
                    <TableRow>
                        <TableHeaderCell>Positions</TableHeaderCell>
                    </TableRow>
                </TableHeader>

                <TableBody>
                    {jobPosition.map(jobPosition=>(
                        <TableRow key={jobPosition.id}> 
                        <TableCell>{jobPosition.positionName}</TableCell>

                    </TableRow>
                    ))
                    }
                    
                </TableBody>

                <TableFooter>
                    <TableRow>
                        <TableHeaderCell colSpan='3'>
                            <Menu floated='right' pagination>
                                <MenuItem as='a' icon>
                                    <Icon name='chevron left' />
                                </MenuItem>
                                <MenuItem as='a'>1</MenuItem>
                                <MenuItem as='a'>2</MenuItem>
                                <MenuItem as='a'>3</MenuItem>
                                <MenuItem as='a'>4</MenuItem>
                                <MenuItem as='a' icon>
                                    <Icon name='chevron right' />
                                </MenuItem>
                            </Menu>
                        </TableHeaderCell>
                    </TableRow>
                </TableFooter>
            </Table>
    </div>
  )
}
