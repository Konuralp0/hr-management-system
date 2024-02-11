import React,  {useState,useEffect} from 'react'
import EmployerService from '../services/employerService'
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

export default function EmployerList() {

    const [employer, setemployer] = useState([])

    useEffect(()=>{

        let employerService = new EmployerService();
        employerService.getEmployers().then(result => setemployer(result.data.data))


    },[])
  
  
  
    return (
    <div>
       <Table celled className='table' size='large'>
                <TableHeader>
                    <TableRow>
                        <TableHeaderCell>Company Name</TableHeaderCell>
                        <TableHeaderCell>Website</TableHeaderCell>
                        <TableHeaderCell>Email</TableHeaderCell>
                    </TableRow>
                </TableHeader>

                <TableBody>
                    {employer.map(employer=>(
                        <TableRow key={employer.id}> 
                        <TableCell>{employer.companyName}</TableCell>
                        <TableCell>{employer.website}</TableCell>
                        <TableCell>{employer.email}</TableCell>
                        

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
