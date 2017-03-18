/*************************************************************************
*                                                                        *
*  This file is part of the 20n/act project.                             *
*  20n/act enables DNA prediction for synthetic biology/bioengineering.  *
*  Copyright (C) 2017 20n Labs, Inc.                                     *
*                                                                        *
*  Please direct all queries to act@20n.com.                             *
*                                                                        *
*  This program is free software: you can redistribute it and/or modify  *
*  it under the terms of the GNU General Public License as published by  *
*  the Free Software Foundation, either version 3 of the License, or     *
*  (at your option) any later version.                                   *
*                                                                        *
*  This program is distributed in the hope that it will be useful,       *
*  but WITHOUT ANY WARRANTY; without even the implied warranty of        *
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
*  GNU General Public License for more details.                          *
*                                                                        *
*  You should have received a copy of the GNU General Public License     *
*  along with this program.  If not, see <http://www.gnu.org/licenses/>. *
*                                                                        *
*************************************************************************/

package com.act.biointerpretation.l2expansion.sparkprojectors

import com.act.biointerpretation.l2expansion.sparkprojectors.io_handlers.WriteToReachablesDatabase

object ReachablesSparkRoProjector extends BasicSparkROProjector with WriteToReachablesDatabase {
  val runningClass = getClass

  val OPTION_READ_DB_NAME: String = "md"
  val OPTION_READ_DB_PORT: String = "mp"
  val OPTION_READ_DB_HOST: String = "mh"
  val OPTION_READ_DB_COLLECTION: String = "mc"
}
