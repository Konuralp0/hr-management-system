import React from 'react'
import { MenuMenu, MenuItem, MenuHeader, Menu } from 'semantic-ui-react'
import { Link } from 'react-router-dom'
import {Route,Routes} from "react-router-dom"
import JobPositionList from '../pages/JobPositionList'
import JobSeekerList from '../pages/JobSeekerList'
import EmployerList from '../pages/EmployerList'


export default function Navi() {
  return (
    <div>
      <Routes>
              <Route exact path="/job-positions" element={<JobPositionList />} />
              <Route exact path="/job-seekers" element={<JobSeekerList/>} />
              <Route path="/employers"  element={<EmployerList/>}/> 
      </Routes>
      <Menu inverted fixed='top' widths={11} >
      
        <MenuItem>
          <Link to="/job-seekers"><MenuHeader>Job Seekers</MenuHeader></Link>
        </MenuItem>

        <MenuItem>
          <Link to="/employers"><MenuHeader>Employers</MenuHeader></Link>
        </MenuItem>

        <MenuItem>
          <Link to="/job-positions"><MenuHeader>Job Positions</MenuHeader></Link>
        </MenuItem>

        <MenuItem>
          <MenuHeader>Support</MenuHeader>
        </MenuItem>
      </Menu>
      
    </div>
  )
}
