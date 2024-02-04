import React,  {useState,useEffect} from 'react'
import JobSeekerService from '../services/jobSeekerService'
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

export default function JobSeekerList() {

    const [jobSeekers, setjobSeekers] = useState([])

    useEffect(()=>{

        let jobSeekerService = new JobSeekerService();
        jobSeekerService.getJobSeekers().then(result => setjobSeekers(result.data.data))


    })
  
  
  
    return (
    <div>
       <Table celled>
                <TableHeader>
                    <TableRow>
                        <TableHeaderCell>First Name</TableHeaderCell>
                        <TableHeaderCell>Last Name</TableHeaderCell>
                        <TableHeaderCell>Id Number</TableHeaderCell>
                        <TableHeaderCell>Birth Year</TableHeaderCell>
                        <TableHeaderCell>Email</TableHeaderCell>
                    </TableRow>
                </TableHeader>

                <TableBody>
                    {jobSeekers.map(jobSeeker=>(
                        <TableRow key={jobSeeker.id}> 
                        <TableCell>{jobSeeker.firstName}</TableCell>
                        <TableCell>{jobSeeker.lastName}</TableCell>
                        <TableCell>{jobSeeker.tcNo}</TableCell>
                        <TableCell>{jobSeeker.birthYear}</TableCell>
                        <TableCell>{jobSeeker.email}</TableCell>
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
