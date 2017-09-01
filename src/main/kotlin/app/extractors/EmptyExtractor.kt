// Copyright 2017 Sourcerer Inc. All Rights Reserved.
// Author: Anatoly Kislov (anatoly@sourcerer.io)

package app.extractors

import app.model.DiffContent
import app.model.CommitStats

class EmptyExtractor : ExtractorInterface {
    override fun extract(diffs: List<DiffContent>): List<CommitStats> {
        return listOf()
    }
}